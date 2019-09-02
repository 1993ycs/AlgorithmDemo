package 多线程与并发;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/14
 * Time:13:22
 */

/**
 * CAS 指的是现代 CPU 广泛支持的一种对内存中的共享数据进行操作的一种特殊指令。这个指令会对内存中的共享数据做原子的读写操作。
 *
 * 简单介绍一下这个指令的操作过程：
 *
 * 首先，CPU 会将内存中将要被更改的数据与期望的值做比较。
 * 然后，当这两个值相等时，CPU 才会将内存中的数值替换为新的值。否则便不做操作。
 * 最后，CPU 会将旧的数值返回。
 * 这一系列的操作是原子的。它们虽然看似复杂，但却是 Java 5 并发机制优于原有锁机制的根本。
 * 简单来说，CAS 的含义是：我认为原有的值应该是什么，如果是，则将原有的值更新为新值，否则不做修改，并告诉我原来的值是多少。 ​
 * 简单的来说，CAS 有 3 个操作数，内存值 V，旧的预期值 A，要修改的新值 B。当且仅当预期值 A 和内存值 V 相同时，将内存值 V 修改为 B，否则返回 V。
 * 这是一种乐观锁的思路，它相信在它修改之前，没有其它线程去修改它；
 * 而 Synchronized 是一种悲观锁，它认为在它修改之前，一定会有其它线程去修改它，悲观锁效率很低。
 */
public class AtomicIntegerTest implements Runnable{
    AtomicInteger integer = new AtomicInteger(100);
    public static void main(String[] args) {

        //AtomicInteger integer = new AtomicInteger(100);
        //ystem.out.println(integer.get());
        AtomicIntegerTest myRunnable = new AtomicIntegerTest();
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
        System.out.println(myRunnable.integer.get());
    }


    @Override
    public void run() {
        System.out.println(integer.getAndDecrement());
    }
}
