package leecode;

import java.security.Key;
import java.util.Arrays;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/3/31
 * Time:21:48
 */
public class Demo08 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        new Demo08().rotate1(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
    public void rotate1(int[] nums, int k) {
        if (nums == null || nums.length<2 || k == 0)
            return;
        k = k%nums.length;
        int i = 0;
        while (k>0 && i < k){
            int temp = nums[nums.length-1-i];
            nums[nums.length-1-i] = nums[k-1];
            k--;
            i++;
        }
    }

    //超时
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length<2 || k == 0)
            return;
        k = k%nums.length;
        int m = k;
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length-k+i];
            for (int j = nums.length-k-1+i;j>= i;j--){
                nums[j+1] = nums[j];
            }
            nums[i] = temp;
            m++;


        }
    }
}
