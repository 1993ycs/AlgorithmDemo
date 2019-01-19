package listDemo;

import java.util.HashMap;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/1/19
 * Time:19:17
 */


public class ListDemo2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        for (int i = 0; i < 10; i++) {
            map.put(i, i*i);
        }
    }

}
