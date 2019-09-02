package 查找和排序;

import java.util.Arrays;
import java.util.Random;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/13
 * Time:6:02
 */
public class InsertSort {
    public static void main(String[] args) {
        int a [] = new int[5];
        Random random = new Random();
        for (int i = 0; i<a.length;i++){
            a[i] = random.nextInt(5);
        }
        System.out.println(Arrays.toString(a));
        System.out.println("----------------------");
        insertionSortSelf(a);
        System.out.println("----------------------");
        System.out.println(Arrays.toString(a));
    }
    public static void insertionSortSelf(int arr[]) {
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i;
            for (;j > 0&& arr[j-1]>arr[j];j--){
                arr[j] = arr[j-1];
            }

            arr[j-1] = temp;
        }

    }

    public static void insertionSort(int arr[]) {

        if (arr == null || arr.length < 2)
            return;
        int n = arr.length;

        //从第二个开始比较 如果比前面小 则 开始交换重新排序
        for (int i = 1; i < n; i++) {

            int temp = arr[i];//当前值
            int j;
            //如果 当前值 比前面的值大 则交换 一直把当前值temp 插入合适的位置为止
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
