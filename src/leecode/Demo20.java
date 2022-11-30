package leecode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Demo20 {
    public static void main(String[] args) {
//        int [][] nums = new int[][];


    }
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return  false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (ch == '[') {
                stack.push(']');
            } else  if (ch == '{') {
                stack.push('}');
            } else if (ch == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
