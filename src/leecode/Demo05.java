package leecode;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Arrays;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/3/31
 * Time:17:23
 */
public class Demo05 {
    public static void main(String[] args) {
        int [] num1 = {1,2,3,0,0,0};
        int [] num2 = {2,5,6};
        new Demo05().merge(num1, 3, num2, 3);

    }

    /**
     * 执行用时 : 1 ms, 在Merge Sorted Array的Java提交中击败了100.00% 的用户
     * 内存消耗 : 37.3 MB, 在Merge Sorted Array的Java提交中击败了0.81% 的用户
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0){
            nums1 = nums2;
        }else {
            int i = m-1,j = n-1;
            int sum = m + n -1;
            while (i >= 0 || j >= 0){
                if (i >= 0 && j >= 0){
                    if (nums1[i] >= nums2[j]){
                        nums1[sum--] = nums1[i];
                        i--;
                    }else {
                        nums1[sum--] = nums2[j];
                        j--;
                    }
                }else if (i < 0){
                    nums1[sum--] = nums2[j];
                    j--;
                }else if (j < 0){
                    nums1[sum--] = nums1[i];
                    i--;
                }

            }
        }
    }
}
