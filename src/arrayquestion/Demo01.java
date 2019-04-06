package arrayquestion;

import com.sun.media.sound.ModelChannelMixer;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/5
 * Time:17:44
 */
public class Demo01 {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,6};
        int [] arr1 = {0,1,2,3,4,5};
        System.out.println(new Demo01().binarygSearch(arr1, 6, 0));
    }

    /**
     * 二分查找
     * @param arr  数组
     * @param n 数组的长度
     * @param target 目标数字
     * @return
     */
    private int binarygSearch(int[] arr, int n, int target){
        int l = 0 ,r = n-1;
      while (l < r){
          int mid = (r-l)/2  + l;//防止整型溢出
          if (arr[mid] == target){
              return mid;
          }else if (arr[mid] > target){
              r = mid;
          }else if (arr[mid] < target){
              l = mid +1;
          }
      }
        return -1;
    }

}
