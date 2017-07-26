/**
 * Created by zhangyan on 2017/7/26.
 */
/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.


就是求回文字符串

思路：把字符串处理一下，把空格和特殊符号都弄掉。然后反过来。看看是不是相等的。
 */
public class leetcode_125 {
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
            if(ch>='A' && ch<='Z'){
                sb.append(ch);
            }
            if(ch>='0' && ch<='9'){
                sb.append(ch);
            }
        }
        String left=sb.toString();

        for(int i=left.length()-1;i>=0;i--){
            char ch=left.charAt(i);
            sb1.append(ch);
        }

        String right=sb1.toString();
//        System.out.println(left+" "+right);
        if(left.equals(right)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        leetcode_125 ss=new leetcode_125();
        System.out.println(ss.isPalindrome("ab"));
    }
}
