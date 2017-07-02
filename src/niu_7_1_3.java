/**
 * Created by zhangyan on 2017/7/1.
 */
public class niu_7_1_3 {
    public int Fibonacci(int n) {
        int []a=new int[40];
        a[1]=1;
        a[2]=1;
        for(int i=3;i<=39;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
    }
    public static void main(String[] args) {
        niu_7_1_3 ss=new niu_7_1_3();
        System.out.print(ss.Fibonacci(39));
    }
}
