package 查找和排序;

import java.util.Arrays;
import java.util.Random;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/13
 * Time:6:18
 */
public class quickSort {
    public static void main(String[] args) {
        int a [] = new int[5];
        Random random = new Random();
        for (int i = 0; i<a.length;i++){
            a[i] = random.nextInt(5);
        }

        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));


    }
    public static int partition(int a[], int low, int high) {
        int privotKey = a[low];
        while (low < high) {
            while (low < high && a[high] >= privotKey) {
                high--;
            }
            quickSort.swap(a, low, high);
            while (low < high && a[low] <= privotKey) {
                low++;
            }
            quickSort.swap(a, low, high);
        }

        return low;
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int privotLoc = partition(a, low, high);
            quickSort(a, low, privotLoc - 1);
            quickSort(a, privotLoc + 1, high);
        }
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void quickSortSelf(int [] a , int low, int  high){
        if (low > high){
            return;
        }
        if (a == null || a.length < 2){
            return;
        }
        int flagTemp = fun(a, low, high);
        quickSortSelf(a, low, flagTemp-1);
        quickSortSelf(a, flagTemp+1, high);
    }

    private static int fun(int[] a, int low, int high) {
        int temp = a[low];
        while (low < high){
            while (low < high && a[high] >= temp){
                high--;
            }
            swap(a, low, high);
            while (low < high && a[low] <= temp){
                low ++;
            }
            swap(a, low, high);
        }
        return low;
    }
}
