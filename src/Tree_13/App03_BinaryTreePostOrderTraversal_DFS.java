package Tree_13;

import java.util.List;

public class App03_BinaryTreePostOrderTraversal_DFS {
    public static void postOrder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        postOrder(root.left, res);
        postOrder(root.right, res);
        res.add(root.val);
    }

    public static void main(String[] args) {

    }
}
