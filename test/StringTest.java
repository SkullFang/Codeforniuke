/**
 * Created by zhangyan on 2017/7/26.
 */
public class StringTest {
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        str=str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>'a' && ch<'z'){
                sb.append(ch);
            }
            if(ch>'A' && ch<'Z'){
                sb.append(ch);
            }
        }
        String left=sb.toString();

        for(int i=left.length()-1;i>=0;i--){
            char ch=left.charAt(i);
            sb1.append(ch);
        }

        String right=sb1.toString();
        System.out.println(left+" "+right);
    }
}
