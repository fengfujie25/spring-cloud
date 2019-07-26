package letcode.tree;

import java.util.Arrays;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-22
 */
public class TreeNode {

    private int val;

    private TreeNode left;

    private TreeNode right;

    public TreeNode(int x) {
        this.val = x;
        this.left = null;
        this.right = null;
    }

    public void display() {
        System.out.print(val + " ");
    }


    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }


    public static void main(String[] args) {

    }
}
