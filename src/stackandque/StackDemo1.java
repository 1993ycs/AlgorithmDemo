package stackandque;

import java.util.Stack;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/1/27
 * Time:0:39
 */
public class StackDemo1 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {

                if (stack.size() == 0) {
                    return false;
                }
                Character c = stack.pop();

                Character match;
                if (s.charAt(i) == ')') {
                    match = '(';
                } else if (s.charAt(i) == ']') {
                    match = '[';
                } else {
                    assert s.charAt(i) == '}';
                    match = '{';
                }

                if (!c.equals(match)) {
                    return false;
                }
            }
        }
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }

        private static void printBool(boolean b){
            System.out.println(b ? "True" : "False");
        }

        public static void main (String[]args){

            printBool(new StackDemo1().isValid("()"));
            printBool((new StackDemo1()).isValid("()[]{}"));
            printBool((new StackDemo1()).isValid("(]"));
            printBool((new StackDemo1()).isValid("([)]"));
        }
    }
