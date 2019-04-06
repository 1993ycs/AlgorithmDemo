package leecode;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/3/31
 * Time:17:07
 */
public class Demo04 {
    public static void main(String[] args) {

    }

    /**
     * 执行用时 : 13 ms, 在Search a 2D Matrix II的Java提交中击败了73.77% 的用户
     * 内存消耗 : 53.1 MB, 在Search a 2D Matrix II的Java提交中击败了2.65% 的用户
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0){
            return false;
        }
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0){
            if (matrix[i][j] > target){
                j--;
            }else if (matrix[i][j] <target){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
}
