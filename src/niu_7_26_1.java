/**
 * Created by zhangyan on 2017/7/26.
 */
/*
汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class niu_7_26_1 {
    public String LeftRotateString(String str,int n) {
        if(str.length()==0){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        for(int i=n;i<str.length();i++){
            char ch=str.charAt(i);
            sb.append(ch);
        }
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            sb.append(ch);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str="abcXYZdef";
        niu_7_26_1 ss=new niu_7_26_1();
        System.out.println(ss.LeftRotateString(str,3));

    }
}
