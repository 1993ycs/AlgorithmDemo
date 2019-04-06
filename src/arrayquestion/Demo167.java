package arrayquestion;

import java.util.Arrays;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/6
 * Time:17:39
 */
public class Demo167 {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int [] nums = (new Demo167()).twoSum(arr, 9);
        System.out.println(Arrays.toString(nums));
    }
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while (i < j){
            if (numbers[i]+numbers[j] > target){
                j--;
            }
            else if (numbers[i]+numbers[j]<target){
                i++;
            }
            else if (numbers[i] + numbers[j] == target){
                return new int []{i+1,j+1};
            }
        }
        return null;

   }
}
