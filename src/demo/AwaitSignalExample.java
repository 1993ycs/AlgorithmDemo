package demo;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/22
 * Time:21:45
 */
public class AwaitSignalExample {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();


    public void before() {
        lock.lock();
        try {
            System.out.println("before");
            condition.signalAll();
//            notifyAll();
        } finally {
            lock.unlock();
        }
    }

    public void after() {
           lock.lock();
            try {
//                wait();
            condition.await();
                System.out.println("after");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {

            lock.unlock();
            }
    }
        public static void main (String[]args) throws InterruptedException {
            ExecutorService executorService = Executors.newCachedThreadPool();
            AwaitSignalExample example = new AwaitSignalExample();
            executorService.execute(() -> example.after());
            executorService.execute(() -> example.before());
//            executorService.awaitTermination(1, TimeUnit.SECONDS);
//            System.out.println("done");
            executorService.shutdown();
            while (true) {
                if (executorService.isTerminated()) {
                    System.out.println("done");
                    break;
                }
            }
        }
    }

