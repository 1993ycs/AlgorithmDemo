package DynamicProgramming;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/22
 * Time:18:40
 */
public class IntegerBreak {
        public int integerBreak(int n) {
        if(n==1){
            return 0;
        }
        int[] dp={1,2,4,6,9};
        if(n<=5){
            return dp[n-2];
        }
        int[] res=new int[n-1];
        for(int i=0;i<5;i++){
            res[i]=dp[i];
        }
        for(int i=5;i<n-1;i++){
            res[i]=Math.max(res[i-2]*2,res[i-3]*3);
        }
        return res[n-2];
    }
}
