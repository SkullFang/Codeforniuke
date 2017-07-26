/**
 * Created by zhangyan on 2017/7/17.
 */
/*
将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 */
public class niu_7_17_4 {
    public int StrToInt(String str) {
        if(str.length()==0)
            return 0;
        int fuhao=1;
        int numstart=1;
        if(str.charAt(0)=='-'){
            fuhao=0;
        } else if(str.charAt(0)>'0' && str.charAt(0)<'9'){
            numstart=0;
        }
        //
        int res=0;
        int errflag=0;
        for(int i=numstart;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>'0' && ch<'9'){
                res=res*10+(ch-'0');
            }else {
                errflag=1;
                break;
            }
        }

        if(errflag==1){
            return 0;
        }else{
            if(fuhao==1)
                return res;
            else
                return 0-res;
        }
    }

    public static void main(String[] args) {
        String str="-123";
        niu_7_17_4 ss=new niu_7_17_4();
        System.out.println(ss.StrToInt(str));

    }
}
