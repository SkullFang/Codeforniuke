/**
 * Created by zhangyan on 2017/7/3.
 */
/*
输入一个链表，反转链表后，输出链表的所有元素。
 */

class ListNode1 {
    int val;
    ListNode1 next = null;

    ListNode1(int val) {
        this.val = val;
    }
}
public class niu_7_3_1 {
    public ListNode1 ReverseList(ListNode1 head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode1 p=head.next;
        head.next=head;
        while (p!=null){
            ListNode1 s=p;
            p=p.next;
            s.next=head.next;
            head.next=s;
        }
        ListNode1 result=head.next;
        head.next=null;
        return result;

    }

    public static void main(String[] args) {
        ListNode1 head=new ListNode1(100);
        ListNode1 a=new ListNode1(1);
        ListNode1 b=new ListNode1(2);
        ListNode1 c=new ListNode1(3);
        ListNode1 d=new ListNode1(4);
        ListNode1 f=new ListNode1(5);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=f;
        niu_7_3_1 ss=new niu_7_3_1();
        ListNode1 re=ss.ReverseList(head);
        ListNode1 p=re;
        while (p!=null){
            System.out.println(p.val);
            p=p.next;
        }
    }
}
