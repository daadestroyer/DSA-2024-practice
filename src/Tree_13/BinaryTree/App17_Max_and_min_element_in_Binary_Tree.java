package Tree_13.BinaryTree;

public class App17_Max_and_min_element_in_Binary_Tree {
    public static int findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    public static int findMin(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int leftMin = findMin(root.left);
        int rightMin = findMin(root.right);
        return Math.min(root.val, Math.max(leftMin, rightMin));
    }

    public static void main(String[] args) {

    }
}
