package Tree_13.BinaryTree;

public class App08_BinaryTreeMaximumPathSum_124 {
    int res = Integer.MIN_VALUE;

    public int getMaxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftH = getMaxPathSum(root.left);
        int rightH = getMaxPathSum(root.right);

        res = Math.max(res, root.val + leftH + rightH);
        // will return parent to the max sum path only
        return root.val + Math.max(leftH, rightH);
    }

    public static void main(String[] args) {

    }
}
