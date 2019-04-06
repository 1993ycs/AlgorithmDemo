package leecode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/3/31
 * Time:16:46
 */
public class Demo3 {
    public static void main(String[] args) {
        int [] arr = {1,3,3};
        System.out.println(new Demo3().majorityElement2(arr));
    }

    /**
     * 执行用时 : 40 ms, 在Majority Element的Java提交中击败了21.37% 的用户
     * 内存消耗 : 52 MB, 在Majority Element的Java提交中击败了0.87% 的用户
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        if (nums == null){
            return -1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if (map.containsKey(nums[i])){
                int value = map.get(nums[i]) +1;
                map.put(nums[i],value);
                continue;
            }
            map.put(nums[i],1);
        }
        for (Map.Entry temp: map.entrySet()) {
            if ((Integer)temp.getValue() > nums.length/2){
                return (Integer) temp.getKey();
            }
        }
        return -1;
    }

    /**
     * 执行用时 : 4 ms, 在Majority Element的Java提交中击败了100.00% 的用户
     * 内存消耗 : 52.3 MB, 在Majority Element的Java提交中击败了0.87% 的用户
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return  nums[nums.length/2];
    }
}
