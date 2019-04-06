package arrayquestion;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/5
 * Time:18:12
 */
public class Demo283 {
    public static void main(String[] args) {
        int [] nums = {0,10,2,0,9};

    }

    /**
     * 移动非零到后面
     * @param nums
     */
    public void moveZeroes(int[] nums) {
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
}
