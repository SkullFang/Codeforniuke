/**
 * Created by zhangyan on 2017/7/6.
 */
/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 */
public class leetcode_283 {
//    public void moveZeroes(int[] nums) {
//        int []temp=new int[nums.length];
//        int k=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=0)
//                temp[k++]=nums[i];
//        }
//        for(int i=0;i<k;i++){
//            nums[i]=temp[i];
//        }
//        for(int i=k;i<nums.length;i++){
//            nums[i]=0;
//        }
//    }
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 ){
                if(k==i){
                    k++;
                }
                else {
                    int temp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = temp;
                    k++;
                }
            }

        }
    }

    public static void main(String[] args) {
        int []nums={1,0,1};
        leetcode_283 ss=new leetcode_283();
        ss.moveZeroes(nums);
        for(int i:nums){
            System.out.println(i);
        }
    }
}
