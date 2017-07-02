/**
 * Created by zhangyan on 2017/7/2.
 */
/*
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class niu_7_2_2 {
    public int RectCover(int target) {
        int []a=new int[100];
        a[1]=1;
        a[2]=2;
        for(int i=3;i<=target;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[target];
    }

    public static void main(String[] args) {
        niu_7_2_2 ss=new niu_7_2_2();

    }
}
