import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zhangyan on 2017/7/4.
 */
/*
输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class niu_7_4_2 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(k>input.length || k==0){
            return result;
        }
        Arrays.sort(input);
        int i=0;
        while (true){
            int flag=1;
            int x=input[i++];
            for(int y:result){
                if(x==y){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                result.add(x);
            }
            if(result.size()==k)
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        int []input={1,5,1,5,2,7,1,8};
        niu_7_4_2 ss=new niu_7_4_2();
        ArrayList<Integer>result=new ArrayList<Integer>();
        result=ss.GetLeastNumbers_Solution(input,3);
        System.out.println(result);
//        for(int i=0;i<10;i++){
//            System.out.print(result.get(i));
//        }
    }
}
