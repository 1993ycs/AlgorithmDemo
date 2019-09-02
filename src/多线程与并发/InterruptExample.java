package 多线程与并发;

import static java.lang.Thread.sleep;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/23
 * Time:22:49
 */
public class InterruptExample {
    private static class MyThread1 extends Thread {
        @Override
        public void run() {
            try {
                sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static class MyThread2 extends Thread {
        @Override
        public void run() {
            while (!interrupted()) {
                // ..
//        sleep();
                System.out.println("run。。");
            }
            System.out.println("Thread end");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new MyThread1();
        thread1.start();
        thread1.interrupt();
//        Thread thread2 = new MyThread2();
//        thread2.start();
////        sleep();
//        thread2.interrupt();
        System.out.println("Main run");
    }

}
