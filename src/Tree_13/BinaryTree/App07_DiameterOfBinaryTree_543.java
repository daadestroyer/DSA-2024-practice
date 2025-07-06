package Tree_13.BinaryTree;

public class App07_DiameterOfBinaryTree_543 {
    public int diameter = 0;

    public int findDiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftH = findDiameter(root.left);
        int rightH = findDiameter(root.right);
        diameter = Math.max(diameter, leftH + rightH);
        return Math.max(leftH, rightH) + 1;
    }
    public static void main(String[] args) {

    }
}
