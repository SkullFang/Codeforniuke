/**
 * Created by zhangyan on 2017/5/12.
 */
public class offer_2 {
    public String replaceSpace(StringBuffer str) {
        StringBuffer resultstr=new StringBuffer(); //注意StringBuffer类型可以appand
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i); // str.charAt() 返回值是一个char类型的
            if(ch==' '){
                resultstr.append("%20");
            }
            else
            {
                resultstr.append(ch);
            }

        }
        return resultstr.toString();
    }
}
