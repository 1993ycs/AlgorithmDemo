package arrayquestion;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/6
 * Time:16:55
 */

import com.sun.corba.se.impl.oa.poa.POAPolicyMediatorImpl_NR_USM;
import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.awt.font.NumericShaper;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

/**
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 */
public class Demo218 {
    public static void main(String[] args) {
        int [] nums = {3,2,1};
        int m =  new Demo218().findKthLargest(nums,2);
        System.out.println(m);

    }
    private void maopaoSort(int [] nums){
        for (int i =0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[j-1] > nums[j]){
                    swap(nums, j, j-1);
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public int findKthLargest(int[] nums, int k) {
        for (int i = 0;i<k;i++){
            for (int j = 0; j<nums.length-1-i;j++){
                if (nums[j] > nums[j+1]){
                    swap(nums, j+1, j);
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums[nums.length-k];
    }
    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i]= nums[j];
        nums[j] = t;
    }
}
