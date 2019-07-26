package letcode.tree;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-25
 */
public class TreeNodeFactory {

    /**
     * 构建一个树
     *
     * @param data
     * @return
     */
    public TreeNode create(int[] data) {
        if (data == null) {
            return null;
        }
        TreeNodeFactory factory = new TreeNodeFactory();
        TreeNode root = null;
        for (int i = 0; i < data.length; i++) {
            root = factory.add(root, data[i]);
        }
        return root;
    }

    /**
     * 添加树节点
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNode add(TreeNode root, int val) {
        TreeNode current = new TreeNode(val);
        if (root == null) {
            root = current;
            return root;
        }
        if (root.getVal() < val) {
            if (root.getRight() == null) {
                root.setRight(current);
            } else {
                root.setRight(add(root.getRight(), val));
            }
        } else {
            if (root.getLeft() == null) {
                root.setLeft(current);
            } else {
                root.setLeft(add(root.getLeft(), val));
            }
        }
        return root;
    }

    /**
     * 前序遍历
     *
     * @param root
     */
    public void beforeSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        root.display();
        beforeSearch(root.getLeft());
        beforeSearch(root.getRight());
    }

    /**
     * 中序遍历
     *
     * @param root
     */
    public void middleSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        middleSearch(root.getLeft());
        root.display();
        middleSearch(root.getRight());
    }

    /**
     * 后续遍历
     *
     * @param root
     */
    public void afterSerach(TreeNode root) {
        if (root == null) {
            return;
        }
        afterSerach(root.getLeft());
        afterSerach(root.getRight());
        root.display();
    }

    public static void main(String[] args) {
        TreeNodeFactory factory = new TreeNodeFactory();
        TreeNode node = factory.create(new int[]{6, 4, 5, 1, 2, 3, 46, 53});
        System.out.print("前序遍历：");
        factory.beforeSearch(node);
        System.out.println();
        System.out.print("中序遍历：");
        factory.middleSearch(node);
        System.out.println();
        System.out.print("后序遍历：");
        factory.afterSerach(node);
    }
}
