/**
 * Created by zhangyan on 2017/7/11.
 */
/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the new length.

1. 设置两个标记，一个是i，i负责从前往后走遍历每个元素。end负责标示最后一个元素。
2. i从前往后遍历，当遇到了下一个等于自己的时候把下一个删掉。
3. 遇到end停止


 */
public class leetcode_26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        int end=nums.length-1;
        int i=0;
        while (i!=end){
            if(nums[i+1]==nums[i]){
                removeEle(nums,i+1);
                end--;
            }else{
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
        int []nums={1,1,2};
        leetcode_26 ss=new leetcode_26();
        System.out.println(ss.removeDuplicates(nums));
//        ss.removeEle(nums,1);
//        for(int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
    }
}
