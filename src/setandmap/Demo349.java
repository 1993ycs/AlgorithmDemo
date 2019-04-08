package setandmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/8
 * Time:21:42
 */
public class Demo349 {

    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0) {
            return new int[]{};
        }
        if (nums2 == null || nums2.length == 0) {
            return new int[]{};
        }
        HashSet set = new HashSet();
        for (int temp : nums1
        ) {
            set.add(temp);
        }
        HashSet<Integer> set1 = new HashSet<>();
        List list = new ArrayList();
        for (int temp : nums2
        ) {
            if (set.contains(temp)) {
                if (!set1.contains(temp)) {
                    set1.add(temp);
                }
            }

        }
        int[] res = new int[set1.size()];
        int i = 0;
        for (int tem : set1
        ) {
            res[i] = tem;
            i++;
        }
        return res;
    }
}