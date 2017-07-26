/**
 * Created by zhangyan on 2017/7/26.
 */
/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".


把元音交换过来。

 */
public class leetcode_345 {
    public String reverseVowels(String s) {
        if(s.length()==0){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(check(ch)){
                sb.append(ch);
            }
        }
        String str=sb.reverse().toString();
        int index=0;
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!check(ch)){
                sb1.append(ch);
            }else{
                sb1.append(str.charAt(index++));
            }
        }
        return sb1.toString();
    }
    public boolean check(char ch){
        if(ch=='a' || ch=='A'){
             return true;
        }
        if(ch=='e' || ch=='E'){
            return true;
        }
        if(ch=='i' || ch=='I'){
            return true;
        }
        if(ch=='o' || ch=='O'){
            return true;
        }
        if(ch=='u' || ch=='U'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="leetcode";
        leetcode_345 ss=new leetcode_345();
        System.out.println(ss.reverseVowels(s));

    }
}
