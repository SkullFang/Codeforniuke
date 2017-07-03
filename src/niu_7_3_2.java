/**
 * Created by zhangyan on 2017/7/3.
 */
/*
输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class niu_7_3_2 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode hd=new ListNode(100);
        if(list1==null && list2==null)
            return null;
        ListNode p1=list1;
        ListNode p2=list2;
        ListNode r=hd;
        while (p1 !=null && p2!=null){
            ListNode s;
            if(p1.val<=p2.val){
                s=p1;
                p1=p1.next;
                r.next=s;
                r=s;
            }else{
                s=p2;
                p2=p2.next;
                r.next=s;
                r=s;
            }
        }
        while (p1!=null){
            ListNode s;
            s=p1;
            p1=p1.next;
            r.next=s;
            r=s;
        }
        while (p2!=null){
            ListNode s;
            s=p2;
            p2=p2.next;
            r.next=s;
            r=s;
        }
        r.next=null;
        return hd.next;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode a=new ListNode(3);
        ListNode b=new ListNode(5);
        ListNode c=new ListNode(7);
        ListNode d=new ListNode(9);
        ListNode f=new ListNode(11);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=f;

        ListNode head2=new ListNode(2);
        ListNode a2=new ListNode(3);
        ListNode b2=new ListNode(6);
        ListNode c2=new ListNode(8);
        ListNode d2=new ListNode(10);
        ListNode f2=new ListNode(12);
        head2.next=a2;
        a2.next=b2;
        b2.next=c2;
//        c2.next=d2;
//        d2.next=f2;

        niu_7_3_2 ss=new niu_7_3_2();
        ListNode he=ss.Merge(head,head2);
        ListNode p=he;
        while (p!=null){
            System.out.println(p.val);
            p=p.next;
        }
    }
}
