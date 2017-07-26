/**
 * Created by zhangyan on 2017/7/26.
 */
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

数组1和数组2都是有序的数组。要求把两个数组进行合并。

思路：重新声明一个数组，然后把两个数组合并之后的结果复制到这个数组中。最后把这个数组复制给num1
 */
public class leetcode_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []tmp=new int[m+n];
        int i=0;
        int j=0;
        int index=0;
        while (i<m && j<n){
            if(nums1[i]<nums2[j]){
                tmp[index++]=nums1[i];
                i++;
            }else {
                tmp[index++]=nums2[j];
                j++;
            }
        }
        while (i<m){ //如果第一个数组有东西
            tmp[index++]=nums1[i++];
        }
        while (j<n){//如果第二个数组有东西。
            tmp[index++]=nums2[j++];
        }

        for(int k=0;k<tmp.length;k++){
            nums1[k]=tmp[k];
        }
    }
    public static void main(String[] args) {
        int []num1={1,3,5,0,0,0,0,0};
        int []num2={2,4,6,7};
        leetcode_88 ss=new leetcode_88();
        ss.merge(num1,3,num2,4);
        for(int i:num1){
            System.out.println(i+" ");
        }

    }
}
