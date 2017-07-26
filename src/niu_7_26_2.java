/**
 * Created by zhangyan on 2017/7/26.
 */
/*
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5

思路： 这个思路超级牛逼，每一步看看后面一个数是不是等于自己。等于的话，自己属于禁区数字。那么后面所有的数字只要等于这个禁区数字都不能加入结果链表。
 */
public class niu_7_26_2 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null)
            return null;
        if(pHead.next==null){
            return pHead;
        }
        ListNode head=new ListNode(99);
        head.next=null;
        ListNode r=head;
        ListNode p=pHead;
        int ban=999;
        while (p.next!=null){

            if(p.val!=p.next.val && p.val!=ban){
//                System.out.print(p.val);
                ListNode s=p;
                r.next=s;
                r=s;
            }else {
                ban=p.val;
            }

            p=p.next;
        }

        if(p.val!=ban){
            ListNode s=p;
            r.next=s;
            r=s;
        }
        r.next=null;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(1);
        ListNode c=new ListNode(1);
        ListNode d=new ListNode(1);
        ListNode e=new ListNode(1);
        ListNode f=new ListNode(1);
        ListNode g=new ListNode(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=null;
        niu_7_26_2 ss=new niu_7_26_2();
        ListNode head=ss.deleteDuplication(a);
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }

    }
}

