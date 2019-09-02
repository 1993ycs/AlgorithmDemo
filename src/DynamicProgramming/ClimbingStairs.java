package DynamicProgramming;

import java.util.Arrays;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/22
 * Time:18:38
 */
public class ClimbingStairs {
    private int[] memo;

    public int climbStairs(int n) {
        memo = new int[n+1];
        Arrays.fill(memo, -1);
        return calcWays(n);
    }

    private int calcWays(int n){

        if(n == 0 || n == 1)
            return 1;

        if(memo[n] == -1)
            memo[n] = calcWays(n - 1) + calcWays(n - 2);

        return memo[n];
    }


    public int climbStairs2(int n) {

        int[] memo = new int[n + 1];
        memo[0] = 1;
        memo[1] = 1;
        for(int i = 2 ; i <= n ; i ++)
            memo[i] = memo[i - 1] + memo[i - 2];
        return memo[n];
    }
    public static void main(String[] args) {

        System.out.println((new ClimbingStairs()).climbStairs(10));
    }
}
