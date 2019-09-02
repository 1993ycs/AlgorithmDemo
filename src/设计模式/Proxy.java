package 设计模式;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/15
 * Time:13:13
 */
//装饰类
public class Proxy implements Source {
    private SourceAble source;//被装饰类
    public  Proxy(){
        super();
        this.source = source;

    }
    private void before(){
        System.out.println("this is before from proxy");
    }
    private void after(){
        System.out.println("this is after from proxy");
    }
    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    public static void main(String[] args) {
        Source Source = new Proxy();
        Source.method();
    }
}
