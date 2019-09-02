package arrayquestion;

import java.util.ArrayList;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/5
 * Time:18:12
 */
public class Demo283 {
//    public static void main(String[] args) {
//        int [] nums = {0,10,2,0,9};
//
//    }

    /**
     * 移动非零到后面
     * 非0移动到前面  记录下0的数量 后面都赋值为 0
     * @param nums
     */
    public void moveZeroesss(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int k =0;
        for (int i =0;i<nums.length;i++){
                if (nums[i] != 0){
                    nums[k++] = nums[i];
                }
        }
        for (;k<nums.length;k++){
            nums[k] = 0;
        }
    }
    /**
     * 移动非零到后面
     * @param nums
     */
    /**
     * 移动非零到后面
     * 非0移动到前面  记录下0的数量 后面都赋值为 0
     * @param nums
     */
    public void moveZeroes0(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int k =0;
        for (int i =0;i<nums.length;i++){
            if (nums[i] != 0){
                int temp =  nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;

            }
        }
    }
    public void moveZeroes1(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int k =0;
        for (int i =0;i<nums.length;i++){
            if (nums[i] != 0){
                if (i != k){
                    int temp =  nums[i];
                    nums[i] = nums[k];
                    nums[k] = temp;
                    k++;
                }else {
                    k++;
                }


            }
        }
    }


    public void moveZeroes(int[] nums) {

        ArrayList<Integer> nonZeroElements = new ArrayList<Integer>();

        // 将vec中所有非0元素放入nonZeroElements中
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nonZeroElements.add(nums[i]);

        // 将nonZeroElements中的所有元素依次放入到nums开始的位置
        for (int i = 0; i < nonZeroElements.size(); i++)
            nums[i] = nonZeroElements.get(i);

        // 将nums剩余的位置放置为0
        for (int i = nonZeroElements.size(); i < nums.length; i++)
            nums[i] = 0;
    }


    public static void main(String args[]){

        int[] arr = {0, 1, 0, 3, 12};

        (new Demo283()).moveZeroes(arr);

        for(int i = 0 ; i < arr.length ; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
