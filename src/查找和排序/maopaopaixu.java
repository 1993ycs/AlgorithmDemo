package 查找和排序;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Arrays;
import java.util.Random;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/13
 * Time:5:31
 */
public class maopaopaixu {
    public static void main(String[] args) {
        int a [] = new int[5];
        Random random = new Random();
        for (int i = 0; i<a.length;i++){
            a[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(a));
        System.out.println("----------------------");
      //  bubbleSort(a);
        bubbleSortSelf(a);
        System.out.println("----------------------");
       // bubbleSorttwo(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSortone(int a[]) {
        if (null == a || a.length == 1) {
            return;
        }
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j< a.length-i-1;j++){
                if (a[j] > a[j+1]){
                    maopaopaixu.swap(a, j, j+1);
                }
            }
        }
    }


    public static void bubbleSorttwo(int arr[]) {

        if (null == arr || arr.length == 1) {
            return;
        }

        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位,即一次比较中没有交换任何元素，这个数组就已经是有序的了
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {        //此处你可能会疑问的j<n-i-1，因为冒泡是把每轮循环中较大的数飘到后面，
                // 数组下标又是从0开始的，i下标后面已经排序的个数就得多减1，总结就是i增多少，j的循环位置减多少
                if (arr[j] > arr[j + 1]) {        //即这两个相邻的数是逆序的，交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;//没有数据交换，数组已经有序，退出排序
            }
            System.out.println(Arrays.toString(arr));
        }
    }


    public static void bubbleSort(int a[]) {
        int i = a.length - 1;
        while (i > 0) {
            int pos = 0;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    pos = j;
                    maopaopaixu.swap(a, j, j + 1);
                }
            }
            System.out.println(Arrays.toString(a));
            i = pos;
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static  void bubbleSortSelf(int [] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        int len = arr.length;

        for (int i = 0; i < len; i++){
            boolean flag = false;
            for (int j = 0; j < len-i-1; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }
}
