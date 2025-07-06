package Tree_13.BinaryTree;

import java.util.ArrayList;

public class App11_BoundaryTraversalOfBinaryTree_GFG {

    public static ArrayList<Integer> result = new ArrayList<>();


    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        boundaryTraversal(node);
    }

    private static ArrayList<Integer> boundaryTraversal(TreeNode node) {
        if (node == null) {
            return new ArrayList<>();
        }
        result.add(node.val);
        addLeftBoundary(node.left);
        addLeavesNode(node);
        addRightBoundary(node.right);
        return result;
    }

    private static void addRightBoundary(TreeNode node) {
        while (node != null) {
            if (!isLeafNode(node)) {
                result.add(node.val);
            }
            node = node.left != null ? node.left : node.right;
        }
    }

    private static void addLeftBoundary(TreeNode node) {
        while (node != null) {
            if (!isLeafNode(node)) {
                result.add(node.val);
            }
            node = node.right != null ? node.right : node.left;
        }
    }

    private static void addLeavesNode(TreeNode node) {
        if (node == null) {
            return;
        }
        if (isLeafNode(node)) {
            result.add(node.val);
            return;
        }
        addLeftBoundary(node.left);
        addLeftBoundary(node.right);
    }

    private static boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;

    }
}
