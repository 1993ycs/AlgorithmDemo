package setandmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/8
 * Time:22:11
 */
public class Demo350 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> record = new TreeMap<Integer, Integer>();//排序的
        int [] num = {1,2,9,4,5,6};
        for (int temp: num
             ) {
            record.put(temp, 1);
        }
        System.out.println(record.toString());
    }
    public int[] intersect(int[] nums1, int[] nums2) {

        TreeMap<Integer, Integer> record = new TreeMap<Integer, Integer>();
        for(int num: nums1)
            if(!record.containsKey(num))
                record.put(num, 1);
            else
                record.put(num, record.get(num) + 1);

        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int num: nums2)
            if(record.containsKey(num) && record.get(num) > 0){
                result.add(num);
                record.put(num, record.get(num) - 1);
            }

        int[] ret = new int[result.size()];
        int index = 0;
        for(Integer num: result)
            ret[index++] = num;

        return ret;
    }

    private static void printArr(int[] arr){
        for(int e: arr)
            System.out.print(e + " ");
        System.out.println();
    }
}
