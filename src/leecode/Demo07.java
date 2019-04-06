package leecode;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/3/31
 * Time:21:44
 */
public class Demo07 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(new Demo07().maxProfit(arr));
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
