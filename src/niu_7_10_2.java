/**
 * Created by zhangyan on 2017/7/10.
 */
/*
一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class niu_7_10_2 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int max=-9999999;
        num1[0]=-9999;
        num2[0]=-9999;
        for(int i=0;i<array.length;i++){
            if(array[i]>max)
                max=array[i];
        }
        int [] temp=new int[max+1];
        for(int i=0;i<max;i++){
            temp[i]=0;
        }
        for (int i=0;i<array.length;i++){
            int index=array[i];
            temp[index]++;
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i]==1){
                if(num1[0]==-9999){
                    num1[0]=i;
                }else{
                    num2[0]=i;
                }
            }
        }
//        System.out.println(num1[0]+" "+num2[0]);

    }

    public static void main(String[] args) {
        niu_7_10_2 ss=new niu_7_10_2();
        int []array={1,2,2,3,4,3,4,5,1,7,8,5};
        int []num1=new int[1];
        int []num2=new int[1];
        ss.FindNumsAppearOnce(array,num1,num2);
    }
}

