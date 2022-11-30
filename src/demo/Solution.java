package demo;

import java.util.ArrayList;
import java.util.LinkedList;

class Solution {
    public static void main(String[] args) {
//        Solution solution = new Solution();
//        String s = "babad";
//        String palindrome = solution.longestPalindrome(s);
//        System.out.println(palindrome);
//        String [] strs = {"ab","a"};
//        String commonPrefix = longestCommonPrefix(strs);
//        System.out.println(commonPrefix);

        String sb = "0123456";
        System.out.println(sb.substring(0, 7));
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        System.out.println(list);
    }
    public String longestPalindrome(String s) {
        return func(s, 0, s.length() - 1);
    }


    private String func(String s, int i, int j) {
        if(i >= j) {
            return s.substring(i, i +1);
        }
        int start = i;
        int end = j;
        while(start < end) {
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                break;
            }
        }

        if(start + 1 >= end) {
            return s.substring(start, end + 1);
        }
        int a = i;
        int b  = j;
        int c = i;
        int d = j;
        String s1 = func(s, a + 1, b);
        String s2 =  func(s, c, d - 1);
        if(s1.length() >= s2.length()) {
            return s1;
        } else {
            return s2;
        }
    }
    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return  null;
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();

        int i = 0;
        boolean flag  = true;
        while(flag) {
            if(strs[0] != null && strs[0].length()-1 < i) {
                break;
            }
            char ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(strs[j] != null && strs[j].length()-1 < i) {
                    flag = false;
                    break;
                }
                if(ch != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                sb.append(ch);
                i++;
            }
        }
        return sb.toString();

    }

    }