/**
 * Created by zhangyan on 2017/7/26.
 */
/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

把字符串反过来
 */
public class leetcode_344 {
    public String reverseString(String s) {
        String res="";
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            sb.append(ch);
        }
        res=sb.toString();
        return res;

    }

}
