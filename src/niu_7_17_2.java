import java.util.ArrayList;

/**
 * Created by zhangyan on 2017/7/17.
 */
/*
题目描述
输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，
如果有多对数字的和等于S，输出两个数的乘积最小的。
输出描述:
对应每个测试案例，输出两个数，小的先输出。


 */
// 使用滑动模块的方法。
public class niu_7_17_2 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(array.length<1){
            return res;
        }

        int []result=new int[2];
        result[0]=result[1]=0;
        int start=0; // 前
        int end=array.length-1;// 后
        int min=9999999;
        while (start!=end){
            if(array[start]+array[end]<sum){
                start++;
            }else if(array[start]+array[end]>sum){
                end--;
            }else {
                if(array[start]*array[end]<min){
                    min=array[start]*array[end];
                    result[0]=array[start];
                    result[1]=array[end];
//                    System.out.print(array[start]+" "+array[end]);
                }
                end--;
            }

        }
        if(result[1]==0){
            return new ArrayList<Integer>();
        }else {
            res.add(result[0]);
            res.add(result[1]);
        }
        return res;
    }

    public static void main(String[] args) {
        int []array={1,2,4,7,11,16};
        niu_7_17_2 ss=new niu_7_17_2();
        ArrayList<Integer> res=ss.FindNumbersWithSum(array,10);
//        System.out.println(res.get(0)+" "+res.get(1));


    }
}
