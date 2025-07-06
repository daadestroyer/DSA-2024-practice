package Tree_13.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class App05_HeightOfBinaryTree_104 {
    public static int recursiveApproach(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int res1 = recursiveApproach(root.left);
        int res2 = recursiveApproach(root.right);
        return Math.max(res1, res2) + 1;
    }

    public static int iterativeApproach(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int height = 0;
        while (!q.isEmpty()) {
            height++;
            for (int i = 0; i < q.size(); i++) {
                if (q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                }
                q.remove();
            }
        }
        return height;
    }

    public static void main(String[] args) {

    }
}
