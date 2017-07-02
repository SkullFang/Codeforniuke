/**
 * Created by zhangyan on 2017/7/1.
 */
public class niu_7_1_2 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        int min=999999;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int []a={3,4,5,1,2};
        niu_7_1_2 ss=new niu_7_1_2();
        System.out.print(ss.minNumberInRotateArray(a));
    }
}
