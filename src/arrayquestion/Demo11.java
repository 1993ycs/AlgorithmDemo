package arrayquestion;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/4/6
 * Time:18:18
 */
public class Demo11 {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        if (height == null || height.length < 2){
            return 0;
        }
        int i = 0;
        int j = height.length-1;
        int  maxhei = Math.min(height[i],height[j]) *(j-i);;
        int temp = 0;
        while (i<j){
            if (Math.min(height[i+1],height[j]) *(j-i-1) > Math.min(height[i],height[j-1]) *(j-i-1)){
                maxhei = Math.min(height[i+1],height[j]) *(j-i);
                i++;
            }else {
                maxhei = Math.min(height[i],height[j-1]) *(j-i-1);
                j--;
            }
        }
        return maxhei;
    }
}
