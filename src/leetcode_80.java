/**
 * Created by zhangyan on 2017/7/26.
 */
/*
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.

翻译 一个数组中一个元素最多出现了二次。最后返回的是新数组的长度。
 */
public class leetcode_80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int i=0;
        int end=nums.length-1;
        while ((i+2)<=end){ //注意这个越界问题
            if(nums[i]==nums[i+2]){
                removeEle(nums,i+2);
                end--;
            }else {
                i++;
            }
        }
        return end+1;
    }
    public void removeEle(int []nums,int index){
        for(int i=index;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
    }
    public static void main(String[] args) {
        int []nums={1,1,1};
        leetcode_80 ss=new leetcode_80();
        System.out.println(ss.removeDuplicates(nums));
    }
}
