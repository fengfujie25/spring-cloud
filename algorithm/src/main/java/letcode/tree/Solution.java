package letcode.tree;

import java.util.Stack;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-22
 */
public class Solution {

    /**
     * 递归方式：时间复杂度o(n)，空间复杂度o(logN)
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.getLeft());
        int right = maxDepth(root.getRight());
        return Math.max(left, right) + 1;
    }

    /**
     * 栈迭代dfs
     *
     * @param root
     * @return
     */
    public int maxDepthByStack(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Stack<TreeNode> stackTree = new Stack<>();
        Stack<Integer> value = new Stack<>();
        stackTree.push(root);
        value.push(1);
        int depth = 0;
        while (!stackTree.isEmpty()) {
            TreeNode treeNode = stackTree.pop();
            int temp = value.pop();
            depth = Math.max(temp, depth);
            if (treeNode.getLeft() != null) {
                stackTree.push(treeNode.getLeft());
                value.push(temp + 1);
            }
            if (treeNode.getRight() != null) {
                stackTree.push(treeNode.getRight());
                value.push(temp + 1);
            }
        }
        return depth;
    }
}
