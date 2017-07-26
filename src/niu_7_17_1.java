/**
 * Created by zhangyan on 2017/7/17.
 */
/*

输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class niu_7_17_1 {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null)
            return null;
        RandomListNode p=pHead.next;
        RandomListNode copy=new RandomListNode(pHead.label);
        RandomListNode r=copy;
        RandomListNode s=null;
        while (p!=null){
            s=new RandomListNode(p.label);
            r.next=s;
            r=s;
            p=p.next;
        }
        //上面是尾插法
        RandomListNode q=copy;
        p=pHead;

        while (p!=null){
//            System.out.print("p"+p.label+"random: ");
            RandomListNode ss=pHead;
            RandomListNode sq=copy;
            while (ss!=p.random){
                ss=ss.next;
                sq=sq.next;
            }
            q.random=sq;
//            System.out.print("sq"+sq.label);
//            System.out.println();
            p=p.next;
            q=q.next;
        }
        return copy;
    }

    public static void main(String[] args) {
        RandomListNode head=new RandomListNode(1);
        RandomListNode a=new RandomListNode(2);
        RandomListNode b=new RandomListNode(3);
        RandomListNode c=new RandomListNode(4);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=null;
        head.random=b;
        a.random=c;
        c.random=head;
        b.random=a;
        niu_7_17_1 ss=new niu_7_17_1();
        RandomListNode copy=ss.Clone(head);

        while (copy!=null){
            System.out.println(copy.label);
            copy=copy.next;
        }


    }
}
