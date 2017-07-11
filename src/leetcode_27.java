/**
 * Created by zhangyan on 2017/7/11.
 *
 * Given an array and a value, remove all instances of that value in place and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 Example:
 Given input array nums = [3,2,2,3], val = 3

 Your function should return length = 2, with the first two elements of nums being 2.
 *
 * 1. 设置一个k,标记最前面。一个i从前往后走。
 * 2.找到如果不等于val 就与它进行交换
 * 3. 最后的数组就是前半部分不是val ，后半部分是val。
 * 4. 从前往后走，找到val就停止，就是找新数组的长度。
 */
public class leetcode_27 {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                if(k==i)
                    k++;
                else{
                    int temp=nums[i];
                    nums[i]=nums[k];
                    nums[k]=temp;
                    k++;
                }
            }
        }
        for(res=0;res<nums.length;res++){
            if(nums[res]==val)
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        int []nums={3,2,2,3};
        leetcode_27 ss=new leetcode_27();
        System.out.print(ss.removeElement(nums,3));
    }
}
