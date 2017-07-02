/**
 * Created by zhangyan on 2017/7/2.
 */
/*
输入一个链表，输出该链表中倒数第k个结点。
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class niu_7_2_6 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null || k<=0)
            return null;
        int listLength=0;
        ListNode p=null;
        ListNode s=null;
        ListNode pp=null;
        p=head;
        while (p!=null){
            listLength++;
            p=p.next;
        }
        if(k>listLength)
            return null;
        int target=listLength-k+1;
        int index=0;
        pp=head;
        while (pp!=null){
            index++;
            if(index==target){
                s=pp;
                break;
            }
            pp=pp.next;
        }
        return s;
    }



    public static void main(String[] args) {
        ListNode head=new ListNode(100);
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode f=new ListNode(5);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=f;
        niu_7_2_6 ss=new niu_7_2_6();
        System.out.println(ss.FindKthToTail(head,1).val);
    }
}
