package arrayquestion;

import java.util.Arrays;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/5
 * Time:19:05
 */
public class Demo27 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,12,2,1,2,1};
        removeElement(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     *
     * 滑动窗口
     * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     *
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}
