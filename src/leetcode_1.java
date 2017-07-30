import java.util.HashMap;

/**
 * Created by zhangyan on 2017/7/28.
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].


 找到等于target的下标
 */
public class leetcode_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int []res=new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(map.containsKey(target-x)){
                int y=map.get(target-x);
                if(y==i){
                    continue;
                }
                if(i<y){
                    res[0]=i;
                    res[1]=y;
                }else{
                    res[0]=y;
                    res[1]=i;
                }
                break;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int []nums={3,2,4};
        leetcode_1 ss=new leetcode_1();

        int []res=ss.twoSum(nums,6);
        for(int i=0;i<2;i++){
            System.out.println(res[i]);
        }
    }
}
