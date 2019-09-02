package 多线程与并发;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/14
 * Time:13:46
 */
public class ProducerConsumer {
    private static BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
//    private static volatile int temp = 0;
    private static AtomicInteger temp = new AtomicInteger(0);
    private static class Producer extends Thread {
        @Override
        public void run() {
            try {
                queue.put("product"+ temp);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("produce"+temp+" ");
            temp.getAndAdd(1);
        }
    }

    private static class Consumer extends Thread {

        @Override
        public void run() {
            try {
                String product = queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("consume..");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Producer producer = new Producer();
            producer.start();

        }
        for (int i = 0; i < 5; i++) {
            Consumer consumer = new Consumer();
            consumer.start();
            //Thread.yield();
        }
        for (int i = 0; i < 3; i++) {
            Producer producer = new Producer();
            producer.start();
        }
    }
}
