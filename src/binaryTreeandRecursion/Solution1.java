package binaryTreeandRecursion;

import stackandque.TreeNode;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/22
 * Time:16:28
 */
// 104. Maximum Depth of Binary Tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
// 时间复杂度: O(n), n是树中的节点个数
// 空间复杂度: O(h), h是树的高度
    //求树的最高深度
class Solution1 {
    public static void main(String[] args) {
    }
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {

        if(root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
