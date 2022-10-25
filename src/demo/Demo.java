package demo;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
//        System.out.println("tt");
//        String s = "1234567891abcdyzABCDYaZ*&^%$#@! <>";
//        for (int i = 0; i < s.length(); i++) {
//            int ch = s.charAt(i);
//            System.out.println(s.charAt(i) + "_" + ch);
//        }
//        char t1 = 'z' + 6;
//        System.out.println(t1);

//        int [] nums = {3,2,4,5,1,2};
//        quickSort(nums, 0, nums.length -1);
//        System.out.println(Arrays.toString(nums));
//        int [] num1 = {3,2,4,5,1,2};
//        qSort(num1, 0, num1.length-1);
//        System.out.println(Arrays.toString(num1));
        //  System.out.println(lengthOfLongestSubstring(s));


//        int [] num2 = {1,2,3,4};
//        ListNode node = buildListNode(num2);
//        System.out.println(node.toString());
//
//        ListNode node1 = reverseNode(node);
//
//        System.out.println(node.toString());
//        System.out.println(node1.toString());
//        int [] num2 = {1,2,3,4};
//        ListNode node = buildListNode(num2);
//        int [] num3 = {1,3,5,7};
//        ListNode node1 = buildListNode(num3);
//        int [] num4 = {1,7,9};
//        ListNode node2 = buildListNode(num4);
//        ListNode [] listNodes = {node, node1, node2};
//        System.out.println(merge2List(node, node1));
//        System.out.println("======================");
//        SingleTon instance = SingleTon.getInstance();
//        SingleTon instance2 = SingleTon.getInstance();
//        System.out.println(instance == instance2);
//        System.out.println(instance.hashCode());
//        System.out.println(instance2.hashCode());
//        SingleTon singleTon = SingleTon.Helper.INSTANCE.singleTon;
//        System.out.println(singleTon.hashCode());

//        int[][] inter = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
//        int[] ints = inter[0];
//        System.out.println(Arrays.toString(ints));
//        System.out.println(inter.length);
//        int[][] merge = merge(inter);
//        System.out.println("tttt");

        int [] nums = {3,4,-1,1};
        int missingPositive = firstMissingPositive(nums);
        System.out.println(missingPositive);

    }

    public static int firstMissingPositive(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= nums.length && nums[i] > 0 && nums[nums[i] -1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
//                int temp =  nums[i];
//                nums[i] = nums[nums[i] - 1];
//                nums[nums[i] - 1] = temp;
            }
        }



        for(int i = 0; i < nums.length; i++) {

            if(i + 1 != nums[i]) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        Arrays.fill(last, -1);
        int n = s.length();

        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }

    public int func(String s) {
        int[] last = new int[128];
        Arrays.fill(last, -1);
        int start, res = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            start = Math.max(i, last[index] + 1);
            res = Math.max(res, i - start + 1);
            last[index] = i;
        }
        return res;
    }

    /**
     * 实现快速排序
     *
     * @param num
     * @param start
     * @param end
     */
    public static void quickSort(int[] num, int start, int end) {
        if (start >= end) {//只剩一个元素不用处理直接结束。
            return;
        }
        //选取基准数
        int val = num[start];
        int l = start;
        int r = end;
        while (l < r) {//当l == r时，就是调整完成时
            //从后往前找第一个小于val的数字
            while (l < r && num[r] > val) {
                r--;
            }
            if (l < r) {//找到了数字
                num[l++] = num[r];
            }
            //从前往后找第一个大于val的数字
            while (l < r && num[l] < val) {
                l++;
            }
            if (l < r) {//找到了数字
                num[r--] = num[l];
            }
        }
        //l==r,基准数放进去
        num[l] = val;
        quickSort(num, start, l - 1);
        quickSort(num, l + 1, end);
    }

    public static ListNode reverseNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    public static void qSort(int[] nums, int start, int end) {

        if (start >= end) {
            return;
        }

        int i = start;
        int j = end;
        int temp = nums[i];
        while (i < j) {
            while (i < j && nums[j] > temp) {
                j--;
            }
            if (i < j) {
                nums[i++] = nums[j];
            }
            while (i < j && nums[i] <= temp) {
                i++;
            }
            if (i < j) {
                nums[j--] = nums[i];
            }
        }

        nums[i] = temp;

        qSort(nums, start, i - 1);
        qSort(nums, i + 1, end);


    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(ListNode next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode buildListNode(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            ListNode node = new ListNode(num);
            cur.next = node;
            cur = cur.next;
        }
        return pre.next;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode pre = null;
        for (ListNode node : lists) {
            pre = merge2List(pre, node);
        }
        return new ListNode();
    }

    public static ListNode merge2List(ListNode a, ListNode b) {
        ListNode pre = new ListNode();
        ListNode cur = pre;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                cur.next = new ListNode(a.val);
                a = a.next;
            } else {
                cur.next = new ListNode(b.val);
                b = b.next;
            }
            cur = cur.next;
        }
        if (a != null) {
            cur.next = a;
        }
        if (b != null) {
            cur.next = b;
        }
        return pre.next;
    }

    private static class SingleTon {
        private SingleTon() {

        }

        public static SingleTon getInstance() {
            return Helper.INSTANCE.singleTon;
        }

        private enum Helper {
            INSTANCE;
            private SingleTon singleTon;

            Helper() {
                this.singleTon = new SingleTon();
            }
//            private SingleTon getSingleTon() {
//                return this.INSTANCE.singleTon;
//            }
        }
    }

    /**
     * 树的层次遍历
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> list1 = new LinkedList<>();
        list1.add(root);
        while (!list1.isEmpty()) {
            int count = list1.size();
            ArrayList<Integer> objects = new ArrayList<>();
            while (count > 0) {
                TreeNode node = list1.poll();
                count--;
                if (node.left != null) {
                    list1.add(node.left);
                }
                if (node.right != null) {
                    list1.add(node.right);
                }
                objects.add(node.val);
            }
            list.add(objects);
            count = list1.size();

        }
        return list;
    }

    public int maxPathSum(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int res = Integer.MIN_VALUE;
        int left = Math.max(0, maxPathSum(root.left));
        int right = Math.max(0, maxPathSum(root.right));
        res = Math.max(res, root.val + left + right);

        return 0;
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        ArrayList<int[]> objects = new ArrayList<>();
        int i = 1;
        int j = intervals.length - 1;
        while (i < j) {
            int l = intervals[i][0];
            int r = intervals[i][1];
            while (++i <= j) {
                if (r >= intervals[i][0]) {
                    r = intervals[i][1];
                } else {
                    break;
                }
            }
            int[] temp = {l, r};
            objects.add(temp);
        }

        int[][] arr = new int[objects.size()][2];
        for (int k = 0; k < objects.size(); k++) {
            arr[k] = objects.get(k);
        }

        return arr;
    }

    public int mySqrt1(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public double mySqrt(int c) {
//        Double.MIN_VALUE
        Double err = 1e-9;
        Double x0 = 0D;
        Double x1 = Double.valueOf(c);
        while (true) {
            x0 = 0.5 * x1 + 0.5 * c / x1;
            if (Math.abs(x1 - x0) < err) {
                break;
            }
            x1 = x0;
        }
        return x1.intValue();
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {

        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(TreeNode left, TreeNode right) {
            this.left = left;
            this.right = right;
        }
    }

}
