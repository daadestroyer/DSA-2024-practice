package Tree_13.BinaryTree;

public class App09_CheckIfTwoTreesAreIdenticalOrNot_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) { // if both meet to null at same time means both are identical
            return true;
        }
        if (p == null || q == null) {
            return false; // if any one meet to null at same time means both are identical
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {

    }
}
