package demo;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution59 {

    public static void main(String[] args) {
        int [] nums = {1,3,-1,-3,5,3,6,7};

        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i = 0, j = 0; i < nums.length; i++) {
            if(!queue.isEmpty() && i - queue.peek() >= k) {
                queue.poll();
            }
            while(!queue.isEmpty() && nums[i] > nums[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.offer(i);
            if(i >= k - 1) {
                res[j++] = nums[queue.peek()];
            }
        }

        return res;
    }
}
