package 设计模式;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/15
 * Time:13:05
 */
public class Singe {
    private static Singe intance = null;

    private Singe(){
        intance = new Singe();
    }

    private static synchronized Singe initSinge(){
        if (intance == null){
            intance = new Singe();
        }
        return intance;
    }

    public static Singe getInstance(){
        if (intance == null){
            initSinge();
        }
        return intance;
    }
}
