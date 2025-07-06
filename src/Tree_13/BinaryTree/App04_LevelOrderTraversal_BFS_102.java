package Tree_13.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App04_LevelOrderTraversal_BFS_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> sl = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                }
                sl.add(q.remove().val);
            }
            list.add(sl);
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
