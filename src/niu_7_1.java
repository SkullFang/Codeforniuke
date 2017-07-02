/**
 * Created by zhangyan on 2017/7/1.
 *
 *用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * import java.util.Stack;

 public class Solution {
 Stack<Integer> stack1 = new Stack<Integer>();
 Stack<Integer> stack2 = new Stack<Integer>();

 public void push(int node) {

 }

 public int pop() {

 }
 }
 *
 */


/*
 * Stack类
 * 栈：桶型或箱型数据类型，后进先出，相对堆Heap为二叉树类型，可以快速定位并操作
 * Stack<E>，支持泛型
 * public class Stack<E> extends Vector<E>
 * Stack的方法调用的Vector的方法，被synchronized修饰，为线程安全(Vector也是)
 * Stack methods：
 * push : 把项压入堆栈顶部 ，并作为此函数的值返回该对象
 * pop : 移除堆栈顶部的对象，并作为此函数的值返回该对象
 * peek : 查看堆栈顶部的对象，，并作为此函数的值返回该对象，但不从堆栈中移除它
 * empty : 测试堆栈是否为空
 * search : 返回对象在堆栈中的位置，以 1 为基数
 *
 */
import java.util.Stack;


public class niu_7_1 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int x=-1;
        if(stack2.empty()){
            while (!stack1.empty()){
                x=stack1.peek();
                stack2.push(x);
                stack1.pop();
            }

        }
        x = stack2.peek();
        stack2.pop();

        return x;

    }
    public static void main(String[] args) {
        niu_7_1 queue=new niu_7_1();
        int []a=new int[5];
        a[0]=10;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        queue.push(a[0]);
        queue.push(a[1]);
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }

}
