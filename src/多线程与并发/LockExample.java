package 多线程与并发;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/14
 * Time:13:14
 */

/**
 * synchronized 原始采用的是 CPU 悲观锁机制，即线程获得的是独占锁。
 * Lock 用的是乐观锁方式。所谓乐观锁就是，
 * 每次不加锁而是假设没有冲突而去完成某项操作，如果因为冲突失败就重试，直到成功为止。乐观锁实现的机制就是 CAS 操作（Compare and Swap）。
 */
public class LockExample {
    AtomicInteger integer = new AtomicInteger(0);
    public static void main(String[] args) {
        LockExample lockExample = new LockExample();

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()-> lockExample.func());
        executorService.execute(()-> lockExample.func());
//        System.out.println(lockExample.integer.get());
        executorService.shutdown();
        while (true){
            if (executorService.isTerminated()){
                System.out.println(lockExample.integer.get());
            }
            break;

        }

    }

    private Lock lock = new ReentrantLock();
    public  void func(){
        lock.lock();
        try {
            for (int i = 0; i<10;i++){
                System.out.print("i=" + integer.getAndIncrement()+ " ");
            }
            System.out.println(Thread.currentThread());
        }finally {
            lock.unlock();
        }
    }
}
