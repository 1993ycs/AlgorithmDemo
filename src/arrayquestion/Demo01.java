package arrayquestion;

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
       // System.out.println(new Demo01().binarygSearch(arr1, 6, 6));
        System.out.println(new Demo01().erfenchazhao(arr1, 3));

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

    private int erfenchazhao(int [] arr, int tar){
        if (arr == null || arr.length == 0){
            System.out.println("输入不合法");
            return  -1;
        }
        if (arr.length == 1 && arr[0] == tar) {
            return 1;
        }
        //  123456
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int midd = (end - start)/2 + start;//如果用 start+end / 2  可看会有整型溢出
            if (tar == arr[midd]){
                return midd;
            }else if (tar > arr[midd]){
                start = midd + 1;
            }else {
                end = midd;//或者写 start = midd  end = midd-1
            }
        }

        return -1;
    }
}
