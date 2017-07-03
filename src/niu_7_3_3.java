/**
 * Created by zhangyan on 2017/7/3.
 */
/*
定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
import java.util.Stack;
public class niu_7_3_3 {
    Stack<Integer> data=new Stack<Integer>();
    Stack<Integer> mindata=new Stack<Integer>();
    int min;
    public void push(int node) {

        if(mindata.empty()){
            min=9999999;
        }else{
            min=mindata.peek();
        }
        data.push(node);
        if(node<min){
            mindata.push(node);
        }
    }

    public void pop() {
        int x=data.peek();
        min=mindata.peek();
        if(x==min){
            mindata.pop();
        }
        data.pop();
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return mindata.peek();
    }

    public static void main(String[] args) {
        niu_7_3_3 ss=new niu_7_3_3();
        ss.push(3);
        ss.push(1);
        ss.push(4);
        ss.push(9);
        System.out.println(ss.min());
    }
}
