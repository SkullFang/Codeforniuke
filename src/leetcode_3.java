/**
 * Created by zhangyan on 2017/7/30.
 */
/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
找到字符串中没有重复元素的字串
 */
public class leetcode_3 {
    public int lengthOfLongestSubstring(String s) {
        short []book=new short[150];
        for(int i=0;i<150;i++){
            book[i]=0;
        }//初始化一个新的数组。

        int i=0;
        int j=0;
        int max=-9999;
        while(j<s.length()){
            if(book[s.charAt(j)]==0){
                book[s.charAt(j)]=1;
                j++;
            }else{
                if(max<(j-i)){
                    max=j-i;
                }
                while (s.charAt(i)!=s.charAt(j)){
                    book[s.charAt(i)]=0;
                    i++;
                }
                i++;
                j++;
            }
        }
        if(s.length()-i>max){
            max=s.length()-i;
        }//最后一次比较是看看j如果走到了最后，是不是比之前循环里面碰到重复的要长。
        return max;
    }

    public static void main(String[] args) {
        String str="pwwkew";
        leetcode_3 ss=new leetcode_3();
        System.out.print(ss.lengthOfLongestSubstring(str));
    }
}
