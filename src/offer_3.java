import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by zhangyan on 2017/5/12.
 */


public class offer_3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (listNode!=null){
            list.add(listNode.val);
            listNode=listNode.next;
        }
        Collections.reverse(list);
        return list;

    }
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
}

