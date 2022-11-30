package leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution56 {
    public static void main(String[] args) {
        int [][] intervals = { {1,3},{2,6},{8,10},{15,18}};
//        [[1,4],[2,3]]
        Solution56 solution56 = new Solution56();
        int[][] merge = solution56.merge(intervals);
    }
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
        ArrayList<int[]> objects = new ArrayList<>();
        int l = intervals[0][0];
        int r = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (r >= intervals[i][0]) {
                r = Math.max(r, intervals[i][1]);
                l = Math.min(l, intervals[i][0]);
            } else {
                int [] temp = {l,r};
                objects.add(temp);
                l = intervals[i][0];
                r = intervals[i][1];
            }
        }
        int [] temp = {l,r};
        objects.add(temp);
        int [] [] arr = new int[objects.size()][2];
        for (int i = 0; i < objects.size(); i++) {
            arr[i] = objects.get(i);
        }

        return arr;
    }
}