package stackandque;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/1/27
 * Time:18:37
 */

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 二叉树遍历
 */
public class TreeNode94 {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode left = new TreeNode(3);
        right = node.right;
        left = node.left;
        ArrayList list = new TreeNode94().fun(node);
        System.out.println(list);

    }
    private  ArrayList<Integer> fun(TreeNode node){
        ArrayList<Integer> list = new ArrayList();
        fun1(node,list);
        return list;
    }

    /**
     * 前序遍历
     * @param node
     * @param list
     */
    private  void fun1(TreeNode node, ArrayList list){
        if (node != null){
            list.add(node.value);
            fun1(node.left,list);
            fun1(node.right,list);
        }
    }
    /**
     * 中序遍历
     * @param node
     * @param list
     */
    private  void fun2(TreeNode node, ArrayList list){
        if (node != null){

            fun1(node.left,list);
            list.add(node.value);
            fun1(node.right,list);
        }
    }
    /**
     * 后序遍历
     * @param node
     * @param list
     */
    private  void fun3(TreeNode node, ArrayList list){
        if (node != null){

            fun1(node.left,list);
            fun1(node.right,list);
            list.add(node.value);
        }
    }

}
