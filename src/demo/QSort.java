package demo;

import java.util.Arrays;

public class QSort {


    public static void main(String[] args) {
        int [] nums = {2,1,3,4,6,5};
        qSort(nums);
        System.out.println(Arrays.toString(nums));
        String s = "123llkgfag";
        System.out.println(s.charAt(0) == s.charAt(1));
        System.out.println(Arrays.stream(nums).max());
    }


    public  static void qSort(int [] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        mainFunc(nums, 0, nums.length -1);
    }

    private static void mainFunc(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;

        int temp = nums[i];

        while (i < j) {

            while (i < j && nums[j] >= temp) {
                j--;
            }

            if (i < j) {
               nums[i++] = nums[j];
            }

            while (i < j && nums[i] < temp) {
                i++;
            }
            if (i < j) {
                nums[j--] = nums[i];
            }
        }
        nums[i] = temp;

        mainFunc(nums, start, i-1);
        mainFunc(nums, i+1, end);

    }
}
