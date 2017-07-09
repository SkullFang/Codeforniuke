import java.util.Stack;

/**
 * Created by zhangyan on 2017/7/9.
 */
/*

输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
（注意：这两个序列的长度是相等的）

判断栈是不是他的顺序序列用一个辅助栈做。
首先1 入栈，然后看看 4是不是等于栈的top 。如果不是就继续入栈
然后2 入栈，然后看看 4是不是等于top 。如果还不是继续入栈

 */
public class niu_7_9_1 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length==0||popA.length==0)
            return false;
        Stack<Integer> temp=new Stack<Integer>();
        int jIndex=0;
        for(int i=0;i<pushA.length;i++){
            temp.push(pushA[i]);
            while (!temp.empty()&&temp.peek()==popA[jIndex]){
                temp.pop();
                jIndex++;
            }
        }
        return temp.empty();

    }
//    public boolean IsPopOrder(int [] pushA,int [] popA) {
//        if(pushA.length == 0 || popA.length == 0)
//            return false;
//        Stack<Integer> s = new Stack<Integer>();
//        //用于标识弹出序列的位置
//        int popIndex = 0;
//        for(int i = 0; i< pushA.length;i++){
//s.push(pushA[i]);
////如果栈不为空，且栈顶元素等于弹出序列
//while(!s.empty() &&s.peek() == popA[popIndex]){
////出栈
//s.pop();
////弹出序列向后一位
//popIndex++;
//}
//}
//return s.empty();
//}

    public static void main(String[] args) {
        int []pushA={1,2,3,4,5};
        int []popA={4,3,5,1,2};
        niu_7_9_1 ss=new niu_7_9_1();
        System.out.print(ss.IsPopOrder(pushA,popA));
    }
}

