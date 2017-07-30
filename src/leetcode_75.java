/**
 * Created by zhangyan on 2017/7/26.
 */
/*
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.

click to show follow up.

Follow up:
A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.

Could you come up with an one-pass algorithm using only constant space?

有红，白，蓝三色。0，1，2表示三种颜色。不能使用库函数，想要使用O（n）算法。
 */
public class leetcode_75 {
//    public void sortColors(int[] nums) {
//        int []book={0,0,0};
//        for(int i=0;i<nums.length;i++){
//            int x=nums[i];
//            book[x]++;
//        }
//        int index=0;
//        for(int i=0;i<book.length;i++){
//            for(int j=0;j<book[i];j++){
//                nums[index++]=i;
//            }
//        }
//    }
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int i=0;
        while (i<=right){
            if(nums[i]==0){
                swap(nums,i++,left++);
            }else if(nums[i]==2){
                swap(nums,i,right--);
            }else{
                i++;
            }
        }

    }
    private void swap(int []nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }


    public static void main(String[] args) {
        int [] nums={1,0,0,2,0,1,0,2,1,0};
        leetcode_75 ss=new leetcode_75();
        ss.sortColors(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
