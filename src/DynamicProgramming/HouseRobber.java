package DynamicProgramming;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/22
 * Time:18:50
 */


public class HouseRobber {

    public int rob(int[] nums) {

        int n = nums.length;
        if(n == 0)
            return 0;

        // memo[i] 表示考虑抢劫 nums[0...i] 所能获得的最大收益
        int[] memo = new int[nums.length];
        memo[0] = nums[0];
        for(int i = 1 ; i < n ; i ++)
            memo[i] = Math.max(memo[i - 1],
                    nums[i] + (i - 2 >= 0 ? memo[i - 2] : 0));

        return memo[n-1];
    }

    public static void main(String[] args) {

        int nums[] = {2, 1,4,7,8};
        System.out.println((new HouseRobber()).rob(nums));
    }

    public int tryRobber(int [] nums){
        if (nums == null ){
            return 0;
        }
        int length = nums.length;
        if (length == 0){
            return 0;
        }

        int [] meno = new int[length];
        meno[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            meno[i] = Math.max(meno[i-1], meno[i] + i-2>=0?meno[i-2]:0);
        }
        return meno[length-1];

    }
}
