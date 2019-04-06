package arrayquestion;

import java.util.Arrays;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/5
 * Time:19:19
 */
public class Demo80 {
    public static void main(String[] args) {

    int [] nums = {0,0,1,1,1,1,2,3,3};
    new Demo80().removeDuplicates(nums);
    System.out.println(Arrays.toString(nums));
    }

    /**
     * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
    }
}
