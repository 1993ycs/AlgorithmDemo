package demo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/18
 * Time:19:00
 */
public class CasDemo {
    /**
     * 乐观锁
     * v m n
     *
     */
    private AtomicInteger count = new AtomicInteger(0);
    public synchronized  void add(){
        System.out.println(count.getAndIncrement());
        System.out.println(count.get());
    }

    public static void main(String[] args) {
        new CasDemo().add();
    }
}
