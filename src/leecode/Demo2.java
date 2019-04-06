package leecode;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/3/31
 * Time:16:34
 */

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
public class Demo2 {
    public static void main(String[] args) {
        int [] arr = {1,2,4,2,1};
        System.out.println(1 ^ 2);
        System.out.println(new Demo2().singleNumber(arr));
    }

    /**
     * 0和任何数异或得任何数；
     * 任何数和它本身异或得0；
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int len = nums.length;
        int result=0;
        for(int i=0;i<len;i++){
            result ^=nums[i];
            System.out.println(result);
            /**
             * 0 -> 1 = 1
             * 1 -> 2 = 3
             * 3 - > 4 =7
             * 7 -> 2 = 5
             */
        }
        return result;
    }
}
