/**
 * Created by zhangyan on 2017/7/11.
 */
/*
求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。

用递归思想
 */
public class niu_7_11_1 {
    public int Sum_Solution(int n) {
        return n==1 ? 1:Sum_Solution(n-1)+n;
    }

    public static void main(String[] args) {
        niu_7_11_1 ss=new niu_7_11_1();
        System.out.println(ss.Sum_Solution(100));
    }
}
