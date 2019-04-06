package arrayquestion;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/6
 * Time:16:21
 */

import java.util.Arrays;

/**
 * 三种颜色 0 1 2有序排序
 */
public class Demo02 {
    public static void main(String[] args) {
        int [] nums = {1,2,1,2,1,0,0,0};
        new Demo02().sortColorsone(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void sortColors(int [] nums){
        int [] col = new int[3];
        for (int i = 0; i < nums.length;i++){
            assert nums[i] >= 0 && nums[i] <= 2;
            col[nums[i]]++;
        }
        int index = 0;
        for (int i =0;i<col[0];i++){
            nums[index++] = 0;
        }
        for (int j = 0;j<col[1];j++){
            nums[index++] = 1;
        }
        for (int k = 0;k<col[2];k++){
            nums[index++] = 2;
        }

    }

    /**
     * 三路排序
     * 遍历一次
     * 时间复杂度 0（n）
     * @param nums
     */
    public void sortColorsone(int[] nums) {

        int zero = -1;          // [0...zero] == 0
        int two = nums.length;  // [two...n-1] == 2   [i...two-1]  ==1   [0..zero,i..two-1,two..n-1]
        for(int i = 0 ; i < two ; ){
            if(nums[i] == 1)
                i ++;
            else if (nums[i] == 2)
                swap(nums, i, --two);
            else{ // nums[i] == 0
                assert nums[i] == 0;
                swap(nums, ++zero, i++);
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i]= nums[j];
        nums[j] = t;
    }
}
