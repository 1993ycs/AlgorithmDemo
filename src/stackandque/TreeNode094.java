package stackandque;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/1/27
 * Time:19:01
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 非递归遍历二叉树
 */
public class TreeNode094 {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        TreeNode left = new TreeNode(2);
        node.right = right;
        node.left = left;
        ArrayList list = (ArrayList) new TreeNode094().inorderTraversal(node);
        System.out.println(list);
    }
    private class Command {
        String s;   // go, print
        TreeNode node;
        Command(String s, TreeNode node) {
            this.s = s;
            this.node = node;
        }
    }

    /**
     * 中序遍历
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Stack<Command> stack = new Stack<Command>();
        stack.push(new Command("go", root));
        while (!stack.empty()) {
            Command command = stack.pop();

            if (command.s.equals("print")) {
                res.add(command.node.value);
            }
            else {
                assert command.s.equals("go");
                if (command.node.right != null) {
                    stack.push(new Command("go", command.node.right));
                }
                stack.push(new Command("print", command.node));
                if (command.node.left != null){
                    stack.push(new Command("go", command.node.left));}
            }
        }
        return res;
    }
}
