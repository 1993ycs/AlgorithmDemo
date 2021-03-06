package arrayquestion;

/**
 *
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/6
 * Time:18:11

 /**
 *
 * 字符串翻转
 *编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 */
public class Demo344 {
    public static void main(String[] args) {
        char [] val = {'1', '2', '3'};
        new Demo344().reverseString(val);
        for (char temp: val
             ) {
            System.out.println(temp);
        }

    }
    public void reverseString(char[] s) {
        if (s==null)
            return;
        int i =0;
        int j = s.length-1;

        while (i<j){
            char temp ;
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
