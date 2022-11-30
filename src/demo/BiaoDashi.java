package demo;

import java.util.LinkedList;

public class BiaoDashi {

    public static void main(String[] args) {
        System.out.println(cal("20+10-5"));
    }
    private  static int cal(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        LinkedList<Character> linkedList = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            linkedList.add(s.charAt(i));
        }
        int ans = 0;
        int val = 0;
        boolean flag = true;
        while (!linkedList.isEmpty()) {
            char ch = linkedList.poll();
            if(ch == '+') {
                ans = flag ? ans + val : ans - val;
                val = 0;
                flag = true;
            } else if(ch == '-') {
                ans = flag ? ans + val : ans - val;
                val = 0;
                flag = false;
            } else {
                val = val * 10 + (ch - '0');
            }
        }
        ans = flag ? ans + val : ans - val;
        return  ans;
    }
}
