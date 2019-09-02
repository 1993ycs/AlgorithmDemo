package commontest;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/20
 * Time:17:06
 */
public class ExceptionHandle {
    public static int doWork() {
        try {
            int i = 10 / 0;
            System.out.println("i=" + i);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException" + e);
            return 0;
        } catch (Exception e) {
            System.out.println("exeption" + e);
            return 1;
        } finally {
            System.out.println("finally");
//              return 2;
        }
        return 2;
    }


    public static void main(String[] args) {
         int i =   ExceptionHandle.doWork();
        System.out.println("-----"+i);
        System.out.println("end");
    }
}
