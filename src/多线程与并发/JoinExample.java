package 多线程与并发;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/23
 * Time:22:58
 */
public class JoinExample {
    private class A extends Thread {
        @Override
        public void run() {
            System.out.println("A");
        }
    }

    private class B extends Thread {
        private A a;
        B(A a) {
            this.a = a;
        }

        @Override
        public void run() {
            try {
                a.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }
    private class C extends Thread {
        private B b;
        C(B b) {
            this.b = b;
        }

        @Override
        public void run() {
            try {
                b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("C");
        }
    }
    private class D extends Thread {
        private C c;
        D(C c) {
            this.c = c;
        }

        @Override
        public void run() {
            try {
                c.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("D");
        }
    }
    public void test() {
        A a = new A();
        B b = new B(a);
        C c = new C(b);
        D d = new D(c);
        b.start();
        a.start();
        c.start();
        d.start();
    }
    public static void main(String[] args) {
        JoinExample example = new JoinExample();
        example.test();

    }
}
