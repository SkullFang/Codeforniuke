import com.sun.tools.javac.util.Pair;

/**
 * Created by zhangyan on 2017/7/26.
 */
/*
Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

For example,
Given [3,2,1,5,6,4] and k = 2, return 5.

Note:
You may assume k is always valid, 1 ? k ? array's length.


翻译，就是找第k大的数

思路：用快速排序的一步找基准，然后看这个基准是不是倒数第k个，如果不是，继续调用。
 */
public class leetcode_215 {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length==0){
            return 0;
        }
        if(k<0 || k>nums.length){
            return -1;
        }
        int left=0;
        int right=nums.length-1;
        int taget=nums.length-k;
        int i=0;
        while (left<=right){
            i=quickSort(nums,left,right);  //
            if(i==taget){
                break;
            }else if(i<taget){
                left=i+1;
            }else {
                right=i-1;
            }
        }
        return nums[i];

    }
    public int quickSort(int []nums,int left,int right){
        int tmp;
        int i=left;
        int j=right;
        tmp=nums[left];
        while (i!=j){
            while (j>i&&nums[j]>tmp) --j;
            if(i<j){
                nums[i]=nums[j];
                ++i;
            }
            while (i<j && nums[i]<tmp) ++i;
            if(i<j){
                nums[j]=nums[i];
                --j;
            }
        }
        nums[i]=tmp;

        return i;

    }

    public static void main(String[] args) {
        int []nums={3,2,1,5,6,4};
        leetcode_215 ss=new leetcode_215();
        System.out.print(ss.findKthLargest(nums,1));

    }
}
