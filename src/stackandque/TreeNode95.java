package stackandque;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/1/27
 * Time:19:22
 */

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 树的层次遍历
 */
public class TreeNode95 {
    public static void main(String[] args) {

    }

    /**
     * 层次遍历
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {

        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) {
            return res;
        }
        // 我们使用LinkedList来做为我们的先入先出的队列
        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<Pair<TreeNode, Integer>>();
        queue.addLast(new Pair<TreeNode, Integer>(root, 0));

        while(!queue.isEmpty()){

            Pair<TreeNode, Integer> front = queue.removeFirst();
            TreeNode node = front.getKey();
            int level = front.getValue();

            if(level == res.size()) {
                res.add(new ArrayList<Integer>());
            }

            res.get(level).add(node.value);
            if(node.left != null) {
                queue.addLast(new Pair<TreeNode, Integer>(node.left, level + 1));

            }if(node.right != null) {
                queue.addLast(new Pair<TreeNode, Integer>(node.right, level + 1));
            }
        }
        return res;
    }
}
