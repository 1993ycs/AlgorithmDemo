package binaryTreeandRecursion;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/22
 * Time:17:43
 */
/// 235. Lowest Common Ancestor of a Binary Search Tree
/// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
/// 时间复杂度: O(lgn), 其中n为树的节点个数
/// 空间复杂度: O(h), 其中h为树的高度
public class Solution6 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.offer(3));
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(Arrays.toString(queue.toArray()));

    }
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(p == null || q == null)
            throw new IllegalArgumentException("p or q can not be null.");

        if(root == null)
            return null;

        if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);

        assert p.val == root.val || q.val == root.val
                || (root.val - p.val) * (root.val - q.val) < 0;

        return root;
    }

    public  TreeNode findlowestNode(TreeNode root, TreeNode l, TreeNode r){
        if (root == null || l == null || r == null){
            throw new IllegalArgumentException("p or q can not be null.");
        }
        if (r.val < root.val && l.val < root.val){
            return findlowestNode(root.left, l, r);

        }
        if (r.val > root.val && l.val > root.val)
        {
            return findlowestNode(root.right, l, r);
        }

        //最后要判断是root的左右孩子？
        return root;
    }
}
