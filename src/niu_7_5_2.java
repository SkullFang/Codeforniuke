import java.util.Stack;

/**
 * Created by zhangyan on 2017/7/5.
 */
/*
输入两个链表，找出它们的第一个公共结点。


用栈去实现
如果有公共节点的话后面应该都是一样的，所以只需要把他们弄进栈中。然后出栈看看最后那个出栈的那个相同的元素即可。
 */
public class niu_7_5_2 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
       if(pHead1 ==null || pHead2==null)
           return null;
        Stack<ListNode> stack1=new Stack<ListNode>();
        Stack<ListNode> stack2=new Stack<ListNode>();
        while (pHead1!=null){
            stack1.push(pHead1);
            pHead1=pHead1.next;
        }
        while (pHead2!=null){
            stack2.push(pHead2);
            pHead2=pHead2.next;
        }
        ListNode result=null;
        while (!stack1.empty() && !stack2.empty() && stack1.peek()==stack2.peek()){

                stack1.pop();

                result=stack2.pop();

        }
        return result;
    }

    public static void main(String[] args) {

    }
}
