/**
 * Created by zhangyan on 2017/7/2.
 */
/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class niu_7_2_5 {
    public void reOrderArray(int [] array) {
        int length=array.length;
        int []temp=new int[length];
        int oddlength=0;
        for(int i=0;i<length;i++){
            if(array[i]%2!=0){
                oddlength++;
            }
        }
        int oddIndex=0;
        int evenIndex=oddlength;
        for(int i=0;i<length;i++){
            if(array[i]%2!=0){
                temp[oddIndex++]=array[i];
            }else{
                temp[evenIndex++]=array[i];
            }
        }
        for(int i=0;i<length;i++){
            array[i]=temp[i];
        }

    }

    public static void main(String[] args) {
        niu_7_2_5 ss=new niu_7_2_5();
        int []a={1,2,3,4,5,8,9,10};
        ss.reOrderArray(a);
    }
}
