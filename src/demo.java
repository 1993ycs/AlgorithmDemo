import com.sun.xml.internal.ws.encoding.soap.streaming.SOAPNamespaceConstants;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/11
 * Time:6:32
 */
public class demo {
    public static void main (String[] args)
    {
        Son son = new Son();
     //   son.setName("ucs");
        son.show();
        //Father son1 = new Son();
        //son1.show();


        Hashtable set = new Hashtable();

    }
}
class Father {
    /**
     * 子类不可以访问父类的私有成员
     * 但可以根据父类提供的方法访问和更改父类成员
     */
    private String name = "father";

    public void show() {

        System.out.println(name);
    }
    public void setName(String name){
        this.name = name;
    }

}

class Son extends Father {
//    protected String name = "son";
//
//    @Override
//    public void show() {
//        this.name = name;
//        System.out.println(name);
//    }

}
