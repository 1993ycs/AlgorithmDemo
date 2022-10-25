package demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Demo1 {
    static class LRUCache {
        private Map<Integer, Integer> integerMap = new HashMap<>();
        private LinkedList<Integer> linkedList = new LinkedList();
        private int capacity;
        private int free;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.free = capacity;
        }

        public int get(int key) {
            if (integerMap.containsKey(key)) {
                Integer remove = linkedList.remove(key);
                linkedList.addLast(remove);
                return integerMap.get(key);
            }
            return -1;
        }

        public void put(int key, int value) {
            if (free <= 0) {
                Integer integer = linkedList.pop();
                integerMap.remove(integer);
                free++;
            }
            free--;
            integerMap.put(key, value);
            linkedList.addLast(key);
        }
    }

    public static void main(String[] args) {
        int reverse = reverse(123);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        // if(x == Integer.MIN_VALUE) {
        //     return 0;
        // }
        boolean flag = x >= 0 ? true : false;
        int res = 0;
        System.out.println(x % 10);
        System.out.println(x / 10);
        while (x != 0) {
            if (flag && (res > (Integer.MAX_VALUE - x % 10) / 10)) {
                return 0;
            }

            if (!flag && (res < (Integer.MIN_VALUE - x % 10) / 10)) {
                return 0;
            }

            res = res * 10 + x % 10;
            x = x / 10;
        }
        return res;
    }

    public boolean CheckPermutation(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>(s1.length());
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map.put(c, 1 + map.getOrDefault(c, 0));
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (map.containsKey(c)) {
                Integer integer = map.get(c);
                if (integer == 1) {
                    map.remove(c);
                } else {
                    map.put(c, map.get(c) - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public double myPow(double x, int n) {
        Math.pow(x, n);
        double res = 1.0;
        for (int i = n; i != 0; i /= 2) {
            if (i % 2 != 0) {
                res *= x;
            }
            x *= x;
        }
        return n < 0 ? 1 / res : res;
    }
//    public boolean isMatch(String s, String p) {
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (p.)
//        }
//    }
}
