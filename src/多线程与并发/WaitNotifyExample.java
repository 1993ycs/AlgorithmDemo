package 多线程与并发;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/14
 * Time:13:40
 */
public class WaitNotifyExample {
    public synchronized void before() {
        System.out.println("before");
        notifyAll();
    }

    public synchronized void after() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }

    public static void main(String[] args) {
        WaitNotifyExample waitNotifyExample = new WaitNotifyExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->waitNotifyExample.after());
        executorService.execute(()->waitNotifyExample.before());
        executorService.shutdown();
        while (true){
            if (executorService.isTerminated()){
                System.out.println("done");
                break;
            }
        }
    }
}
