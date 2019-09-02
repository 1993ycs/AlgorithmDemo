package demo;

import java.util.concurrent.*;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/22
 * Time:21:35
 */
public class Exuctors {
    public static void main(String[] args) {
        ExecutorService executor1 =  new ThreadPoolExecutor(
                10,
                100,
                1000,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        executor1.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        });
        executor1.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world1");
            }
        });
        executor1.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world2");
            }
        });
        executor1.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world3");
            }
        });
        executor1.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world4");
            }
        });
        executor1.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
        executor1.shutdown();
        executor1.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("123");
            }
        });

    }
}
