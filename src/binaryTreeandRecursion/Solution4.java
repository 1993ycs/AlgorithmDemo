package binaryTreeandRecursion;

import com.sun.org.apache.xerces.internal.xs.LSInputList;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.ArrayList;
import java.util.List;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/8/22
 * Time:16:57
 */

/**
 * /// 257. Binary Tree Paths
 * /// https://leetcode.com/problems/binary-tree-paths/description/
 * /// 时间复杂度: O(n), n为树中的节点个数
 * /// 空间复杂度: O(h), h为树的高度
 */
public class Solution4 {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res = new ArrayList<String>();

        if(root == null)
            return res;

        if(root.left == null && root.right == null){
            res.add(Integer.toString(root.val));
            return res;
        }

        List<String> leftPaths = binaryTreePaths(root.left);
        for(String s: leftPaths){
            StringBuilder sb = new StringBuilder(Integer.toString(root.val));
            sb.append("->");
            sb.append(s);
            res.add(sb.toString());
        }

        List<String> rightPaths = binaryTreePaths(root.right);
        for(String s: rightPaths) {
            StringBuilder sb = new StringBuilder(Integer.toString(root.val));
            sb.append("->");
            sb.append(s);
            res.add(sb.toString());
        }

        return res;
    }

    public ArrayList<String> findPaths(TreeNode root){
        ArrayList<String> list = new ArrayList<>();
        if (root == null){
            return list;
        }

        if (root.left == null && root.right == null){
            list.add(Integer.toString(root.val));
            return list;
        }
        ArrayList<String> leftPaths = findPaths(root.left);
        for (String  temp: leftPaths
             ) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(Integer.toString(root.val));
            stringBuffer.append("->");
            stringBuffer.append(temp);
            list.add(stringBuffer.toString());
        }
        ArrayList<String> rightPaths = findPaths(root.right);
        for (String  temp: rightPaths
        ) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(Integer.toString(root.val));
            stringBuffer.append("->");
            stringBuffer.append(temp);
            list.add(stringBuffer.toString());
        }
        return list;
    }
}


