package leecode;

import sun.misc.PostVMInitHook;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/3/31
 * Time:17:44
 */
public class Demo06 {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        if (nums == null)
            return 0;
        if (nums.length < 2)
            return nums.length;
        int k=1;       //第一个肯定不同，所以把不同的元素从第二个开始赋.k记录的索引为数组中不重复元素的个数
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k++]=nums[i];
            }
        }
        return  k;
    }
    public int maxProfit(int[] prices) {
        int ans=0;
        for(int i=1;i<=prices.length-1;i++)
        {
            if(prices[i]>prices[i-1])
            {
                ans+=prices[i]-prices[i-1];
            }
        }
        return ans;
    }

}
