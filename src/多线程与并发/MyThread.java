package 多线程与并发;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/14
 * Time:13:01
 */
public class MyThread extends Thread {
    public void run() {
        System.out.println("我是。。。");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
      //  myThread.start();
        System.out.println(myThread.getName());
        /**
         * 为什么引入Executor线程池框架？
         *
         * new Thread() 的缺点
         *
         * 每次 new Thread() 耗费性能
         * 调用 new Thread() 创建的线程缺乏管理，被称为野线程，而且可以无限制创建，之间相互竞争，会导致过多占用系统资源导致系统瘫痪。
         * 不利于扩展，比如如定时执行、定期执行、线程中断
         * 采用线程池的优点
         *
         * 重用存在的线程，减少对象创建、消亡的开销，性能佳
         * 可有效控制最大并发线程数，提高系统资源的使用率，同时避免过多资源竞争，避免堵塞
         * 提供定时执行、定期执行、单线程、并发数控制等功能
         */
        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.

        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable());

        }
        executorService.shutdown();
    }
}
