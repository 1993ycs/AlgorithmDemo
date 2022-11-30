package demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        // Scanner input=new Scanner(System.in);
        // String str=input.next();
        System.out.println("hello world");
        int [] nums = {2,1,0,-3,-1,3,-5,4,-5,-1};
        IntStream.of(nums).sum();
        threeSum(nums);
        res.forEach(list -> {
            System.out.println(list.toString());
        });


        int [] arr = {0,1,2,3};
        System.out.println(erfengchazhao(nums, 1, 0, arr.length - 1));

    }
    static List<List<Integer>> res =new LinkedList<>();
    private static List<List<Integer>> threeSum(int [] nums) {
        if(nums == null || nums.length <= 2) {
            return null;
        }



        Arrays.sort(nums);
        for(int i = 0; i< nums.length - 2; i ++) {
            if(nums[i] > 0) {
                break;
            } else if(nums[i] < 0 && nums[nums.length - 1] < 0) {
                break;
            }
            if(i >=1) {
                if(nums[i] == nums[i-1]) {
                    continue;
                }
            }
            findNum(nums, i + 1, nums.length-1, 0 - nums[i]);
        }
        return res;
    }

    private static void findNum(int [] nums, int start, int end, int tar) {
        while(start < end) {
            if(nums[start] + nums[end] == tar) {
                List<Integer> list = new LinkedList<>();
                list.add(nums[start]);
                list.add(nums[end]);
                list.add(0-tar);
                res.add(list);
                while (start + 1 < end && nums[start+1] == nums[start]) {
                    start ++;
                }
                while (start < end -1 && nums[end-1] == end) {
                    end++;
                }
                end--;
                start++;
            } else if(nums[end] + nums[start] > tar) {
                end--;
            } else if(nums[end] + nums[start] < tar) {
                start++;
            }
        }
    }
    public int search(int[] nums, int target) {


        return  -1;

    }


    private static int erfengchazhao(int [] nums, int tar, int start, int end) {
        if(start > end) {
            return -1;
        }

        //  0 1 2 3 4
        int mid = (start + end) / 2;
        int temp = nums[mid];
        if (temp == tar) {
            return mid;
        }
        if (temp > tar) {
            return erfengchazhao(nums, tar, start, mid - 1);
        } else {
            return erfengchazhao(nums, tar, mid + 1, end);
        }

    }
}