import java.util.ArrayList;

/**
 * Created by zhangyan on 2017/7/9.
 */
/*
求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
 */
public class niu_7_9_3 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int result=0;
        if(n==0)
            result=0;
        else{
            for (int i=1;i<=n;i++){
                int num=i;
                while (num!=0){
                    int wei=num%10;
                    if(wei==1){
                        result++;
                    }
                    num/=10;
                }
            }
        }
        return result;

    }


    public static void main(String[] args) {
        niu_7_9_3 ss=new niu_7_9_3();
        System.out.print(ss.NumberOf1Between1AndN_Solution(13));

    }
}

