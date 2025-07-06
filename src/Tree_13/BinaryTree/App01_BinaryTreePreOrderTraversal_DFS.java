package Tree_13.BinaryTree;

import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class App01_BinaryTreePreOrderTraversal_DFS {
    public static void preorderTraversal(TreeNode root, List<Integer> res) {
        if(root == null){
            return;
        }
        res.add(root.val);
        preorderTraversal(root.left,res);
        preorderTraversal(root.right,res);
    }

    public static void main(String[] args) {

    }
}
