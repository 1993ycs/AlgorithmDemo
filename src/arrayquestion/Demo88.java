package arrayquestion;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/6
 * Time:16:49
 */
public class Demo88 {
    /**
     * 两个有序数组合并为一个有序数组
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
                }else if (j<0){
                    nums1[sum--] = nums1[i];
                    i--;
                }

            }
        }
    }
}
