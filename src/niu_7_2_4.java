import java.math.BigDecimal;

/**
 * Created by zhangyan on 2017/7/2.
 */
/*
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方


高精度http://blog.csdn.net/luhuajcdd/article/details/9056499
 */



public class niu_7_2_4 {
    public double Power(double base, int exponent) {
        BigDecimal b1=new BigDecimal(Double.toString(base));
        BigDecimal b2=b1;
        int flag=exponent;
        if(exponent==0)
            return 1;
        if(exponent<0)
            exponent=0-exponent;
        for(int i=1;i<exponent;i++){
            b1=b1.multiply(b2);
        }
        if(flag>=0) {
            return b1.doubleValue();
        }
        else {
            BigDecimal yi=new BigDecimal(Double.toString(1.0));
            return yi.divide(b1,6,BigDecimal.ROUND_HALF_UP).doubleValue();
        }
    }
    public static void main(String[] args) {
        niu_7_2_4 ss=new niu_7_2_4();
        System.out.print(ss.Power(2,-3));
    }
}

