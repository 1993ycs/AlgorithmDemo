package 查找和排序;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Arrays;
import java.util.Random;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/13
 * Time:6:42
 */
public class erfengchazhoa {
    public static void main(String[] args) {
        int a [] = new int[5];
        Random random = new Random();
        for (int i = 0; i<a.length;i++){
            a[i] = random.nextInt(4);
        }
        maopaopaixu.bubbleSort(a);

        System.out.println(Arrays.toString(a));
        int m = fun(a, 3);
        System.out.println(m);
    }
    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = (high - low)/2 + low;//避免数组整型越界
            if (value == array[middle]) {
                return middle;
            }
            if (value > array[middle]) {
                low = middle + 1;
            }
            if (value < array[middle]) {
                high = middle - 1;
            }
        }
        return -1;
    }
    public static int fun(int[] array, int value) {
        if (array == null){
            return -1;
        }
        int low = 0;
        int high = array.length-1;
        while (low < high){
            int mid = (high - low)/2 + low;
            if (array[mid] == value){
                return mid;
            }
            if (array[mid] > value){
                high = mid -1;
            }
            low = mid + 1;
        }
        return -1;
    }
    /**
     * 有哨兵顺序查找  不用循环的 顺序查找
     *
     * @param a
     *            数组(下标为0存放哨兵元素)
     * @param key
     *            待查询关键字
     * @return 关键字下标 返回0 则未找到
     */
    public static int sequentialSearch2(int[] a, int key) {
        int index = a.length - 1;
        //a[0] = key;// 将下标为0的数组元素设置为哨兵
        while (a[index] != key) {
            index--;
        }
        return index;
    }
}
