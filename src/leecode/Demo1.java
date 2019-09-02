package leecode;

import com.sun.glass.ui.Size;
import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.nashorn.internal.ir.WhileNode;
import org.omg.PortableInterceptor.INACTIVE;
import sun.text.resources.tr.FormatData_tr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/3/31
 * Time:15:43
 */
public class Demo1 {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * @param args
     */
    public static void main(String[] args) {
        int Size = 5;
        int [] arr = new int[Size];
        Random random = new Random();
        for (int i = 0; i < Size; i++) {
            arr[i] =  random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        int [] tarArr = new int[2];
        tarArr  = Demo1.twoSum_2(arr, 10);
        System.out.println(Arrays.toString(tarArr));

    }

    /**
     * 执行用时 : 67 ms, 在Two Sum的Java提交中击败了19.02% 的用户
     * 内存消耗 : 37.4 MB, 在Two Sum的Java提交中击败了0.99% 的用户
     * @param nums
     * @param target
     * @return
     */
    public  int[] twoSum(int[] nums, int target) {
        if (null == nums || nums.length < 2) {
            return null;
        }

//        int i= 0;
//        int j = i +1;
        int [] tarArr = new int[2];
        for (int i = 0; i< nums.length-2; i++){
            for (int j = i + 1; j < nums.length-1; j++){
                if (nums[i] + nums[j] == target){
                    tarArr[0] = i;
                    tarArr[1] = j;
                    return tarArr;
                }
            }
        }
        return null;

    }

    /**
     * 执行用时 : 7 ms, 在Two Sum的Java提交中击败了89.46% 的用户
     * 内存消耗 : 38.8 MB, 在Two Sum的Java提交中击败了0.99% 的用户
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum_2(int[] nums, int target) {
        if (null == nums || nums.length < 2) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length ; i++) {
            int resSum = target - nums[i];
            if (map.containsKey(resSum)){
                //return  new int []{i, map.get(resSum)};
                return new int[]{i, map.get(resSum)};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
