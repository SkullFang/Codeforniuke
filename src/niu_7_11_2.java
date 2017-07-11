import java.util.HashMap;

/**
 * Created by zhangyan on 2017/7/11.
 */
/*
一个链表中包含环，请找出该链表的环的入口结点

这一题很简单，就是找环的入口
 */
public class niu_7_11_2 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        HashMap<ListNode,String> map=new HashMap<ListNode, String>();
        if(pHead.next==null)
            return null;
        ListNode res=pHead;

        while (true){

            if(map.get(res)==null){
                map.put(res,"1");
            }else{
                break;
            }
            res=res.next;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=b;
        niu_7_11_2 ss=new niu_7_11_2();
        System.out.print(ss.EntryNodeOfLoop(a).val);

    }
}
