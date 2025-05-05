package Tree_13;

public class App06_CheckBinaryTreeBalancedOrNot {

    public static int optimalApproach(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // doing POST order traversal [left,right,root]
        int leftHeight = optimalApproach(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = optimalApproach(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(rightHeight - leftHeight) > 1) {
            return -1;
        }
        return Math.max(rightHeight, leftHeight) + 1;
    }

    public static boolean bruteForce(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (Math.abs(rightHeight - leftHeight) <= 1 && bruteForce(root.left) && bruteForce(root.right)) {
            return true;
        }
        return false;
    }

    private static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

    }
}
