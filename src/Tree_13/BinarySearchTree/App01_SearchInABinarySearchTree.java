package Tree_13.BinarySearchTree;

public class App01_SearchInABinarySearchTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    private static TreeNode findNode(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        } else if (root.val < val) {
            return findNode(root.left, val);
        } else {
            return findNode(root.right, val);
        }
    }

    public static void main(String[] args) {
        int val = 2;
        TreeNode root = new TreeNode();
        TreeNode node = findNode(root, val);
    }


}
