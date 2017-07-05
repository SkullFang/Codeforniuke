import java.util.Arrays;

/**
 * Created by zhangyan on 2017/7/4.
 */
/*
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class niu_7_4_1 {
    public int MoreThanHalfNum_Solution(int [] array) {
//        for(int i=0;i<array.length;i++){
//
//        }
        Arrays.sort(array);
        int mid=(array.length)/2;
        int result=array[mid];
        int s=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==result){
                s++;
            }
        }
        if(s>=(mid+1)){
            return result;
        }else{
            return 0;
        }

    }

    public static void main(String[] args) {
        niu_7_4_1 ss=new niu_7_4_1();
        int []arr={1};
        System.out.println(ss.MoreThanHalfNum_Solution(arr));
    }
}
