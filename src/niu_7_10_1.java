/**
 * Created by zhangyan on 2017/7/10.
 */
/*
统计一个数字在排序数组中出现的次数
 */
public class niu_7_10_1 {
    public int GetNumberOfK(int [] array , int k) {
        int result=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==k)
                result++;
        }
        return result;

    }


    public static void main(String[] args) {
        niu_7_10_1 ss=new niu_7_10_1();

    }
}
