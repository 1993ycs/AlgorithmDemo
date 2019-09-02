package 多线程与并发;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/31
 * Time:5:16
 */
public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService demo = Executors.newFixedThreadPool(10);
        demo.execute(()-> new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
            }
        }.run());
        demo.execute(()-> new Runnable() {
            @Override
            public void run() {
                System.out.println("B");
            }
        }.run());
        demo.execute(()-> new Runnable() {
            @Override
            public void run() {
                System.out.println("C");
            }
        }.run());

        demo.shutdown();
    }
}
