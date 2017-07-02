/**
 * Created by zhangyan on 2017/7/2.
 */
/*
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
  //十进制 -> 二进制
        String str = Integer.toBinaryString(a);
        while(str.length() < 32){
            str = 0 + str;
        }
        System.out.println("10 -> 2：" + str);

        //十进制 -> 八进制
        str = Integer.toOctalString(a);
        System.out.println("10 -> 8：" + str);

        //十进制 -> 十六进制
        str = Integer.toHexString(a);
        System.out.println("10 -> 16：" + str);

        //十进制 -> 特定进制
        int random = (int)(Math.random() * 10);
        str = Integer.toString(a, random);
        System.out.println("10 -> " + random + "：" + str);

        //二进制 -> 十进制
        str = "1010"; //补0
        a = Integer.parseInt(str, 2);
        System.out.println("2 -> 10：" + a);

        //八进制 -> 十进制
        str = "12";
        a = Integer.parseInt(str, 8); //str转为int后的值必须大于8
        System.out.println("8 -> 10：" + a);

        //十六进制 -> 十进制
        str = "a";
        a = Integer.parseInt(str, 16);
        System.out.println("16 -> 10：" + a);
知识点：
      //十进制 -> 二进制
        String str = Integer.toBinaryString(a);
        while(str.length() < 32){
            str = 0 + str;
        }
        System.out.println("10 -> 2：" + str);
 */
public class niu_7_2_3 {
    public int NumberOf1(int n) {
        String str=Integer.toBinaryString(n);
        while (str.length()<32){
            str=0+str;
        }
//        System.out.println("10 -> 2：" + str);
        int s=0;
        for(int i=0;i<str.length();i++){
//            System.out.print(str.charAt(i));
            char ch=str.charAt(i);
            if(ch=='1'){
                s++;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        niu_7_2_3 ss=new niu_7_2_3();
        System.out.print(ss.NumberOf1(-10));
    }
}
