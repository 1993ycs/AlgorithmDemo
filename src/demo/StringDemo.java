package demo;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/18
 * Time:18:58
 */
public class StringDemo {
    public static void main(String[] args) {
        String string = "a";
        string.intern();
        String string1 = new String("a");
        System.out.println(string == string1);
        System.out.println(string.equals(string1));
    }
}
