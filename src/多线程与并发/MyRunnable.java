package 多线程与并发;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/14
 * Time:12:57
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("我是runnable线程:"+t.getId() + t.getName()+t.getPriority());
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);
        Thread thread4 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread.start();

    }
}
