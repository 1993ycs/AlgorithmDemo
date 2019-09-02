package DynamicProgramming;

import java.util.Arrays;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/22
 * Time:18:12
 */
public class Fibonacci1 {
    public int fib(int n){

        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
//        System.out.println(memo.toString());
        memo[0] = 0;
        memo[1] = 1;
        for(int i = 2 ; i <= n ; i ++)
            memo[i] = memo[i - 1] + memo[i - 2];
        System.out.println(Arrays.toString(memo));
        return memo[n];
    }

    public static void main(String[] args) {
//        int[] memo = new int[9 + 1];
//        Arrays.fill(memo, -1);
//        System.out.println(Arrays.toString(memo));
//        int n = 42;
        int n = 300000; // 注意: 我们使用n = 1000只是为了测试性能, 实际上会溢出
        // 斐波那契额数列是以指数速度上涨的

        Fibonacci1 solution = new Fibonacci1();
        long startTime = System.currentTimeMillis();
        int res = solution.fibNum(n);
        long endTime = System.currentTimeMillis();

        System.out.println("fib(" + n + ") = " + res);
        System.out.println("time : " + (endTime - startTime) + " ms");
    }
    //num 是数组的下标
    public  int fibNum(int num){
        int arr []  = new int[num + 1];
        Arrays.fill(arr, -1);
        arr[0] = 0;
        arr[1] = 1;
        if (num == 0)
            return 0;
        if(num == 1)
            return 1;
        for (int i = 2;i<= num; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[num];
    }
}
