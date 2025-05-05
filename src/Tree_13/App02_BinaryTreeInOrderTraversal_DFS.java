package Tree_13;


import java.util.List;

public class App02_BinaryTreeInOrderTraversal_DFS {
    public static void inOrder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inOrder(root.left, res);
        res.add(root.val);

        inOrder(root.right, res);
    }

    public static void main(String[] args) {

    }
}
