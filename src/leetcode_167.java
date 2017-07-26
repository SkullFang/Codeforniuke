/**
 * Created by zhangyan on 2017/7/26.
 */
/*
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2


在有序数组中找两个等于taget的下标；

思路：两个指针一个在最左边，一个在最右边然后进行对撞。看是不是等于target
 */
public class leetcode_167 {
    public int[] twoSum(int[] numbers, int target) {
        int []res={0,0};
        int i=0,j=numbers.length-1;
        while (i<j){
            if(numbers[i]+numbers[j]==target){
                res[0]=i+1;
                res[1]=j+1;
                break;
            }else if(numbers[i]+numbers[j]>target){
                j--;
            }else {
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int []nums={2,3,4};
        leetcode_167 ss=new leetcode_167();
        int []res=new int[3];
        res=ss.twoSum(nums,6);
        for (int i:res){
            System.out.println(i);
        }

    }
}
