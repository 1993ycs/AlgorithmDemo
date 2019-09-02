package binaryTreeandRecursion;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/22
 * Time:16:50
 */
public class Solution3 {
    /// 112. Path Sum
/// https://leetcode.com/problems/path-sum/description/
/// 时间复杂度: O(n), n为树的节点个数
/// 空间复杂度: O(h), h为树的高度


        // Definition for a binary tree node.
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }

        public boolean hasPathSum(TreeNode root, int sum) {

            if(root == null)
                return false;

            if(root.left == null && root.right == null)
                return sum == root.val;

            return hasPathSum(root.left, sum - root.val)
                    || hasPathSum(root.right, sum - root.val);
        }
    }

