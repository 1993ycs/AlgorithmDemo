package arrayquestion;

import java.util.Arrays;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/6
 * Time:17:59
 */
public class Demo125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        if (s == null)    return false;
        String pure = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0, j = pure.length() - 1;
        while (i < j) {
            if (pure.charAt(i++) != pure.charAt(j--))
                return false;
        }
        return true;

    }
}
