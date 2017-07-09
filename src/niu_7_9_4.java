/**
 * Created by zhangyan on 2017/7/9.
 */
/*
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
/*
关键在于比较两个字符串加起来的大小
 */
public class niu_7_9_4 {
    public String PrintMinNumber(int [] numbers) {
        String[] str=new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            str[i]=Integer.toString(numbers[i]);
        }
        Sort(str);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.append(str[i]);
//            System.out.println(str[i]);
        }
//        System.out.println(sb.toString());
        return sb.toString();

    }
    public void Sort(String [] str){
        int i=str.length;
        String temp;
        while (i>0){
            for(int j=0;j<i-1;j++){
                if(comparestr(str[j],str[j+1])>0){
                    temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
            i--;
        }
    }
    public int comparestr(String a,String b){
        String str1=a+b;
        String str2=b+a;
        return str1.compareTo(str2);
    }
    public static void main(String[] args) {
        int []num={3,32,321};
        niu_7_9_4 ss=new niu_7_9_4();
        System.out.print(ss.PrintMinNumber(num));
    }
}
