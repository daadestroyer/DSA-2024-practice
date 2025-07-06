package Tree_13.BinaryTree;

import java.util.*;

public class App13_TopViewOfBinaryTree_GFG {

    static class Pair {
        int hori_dist;
        TreeNode node;

        public Pair(int hori_dist, TreeNode node) {
            this.hori_dist = hori_dist;
            this.node = node;
        }
    }

    static ArrayList<Integer> topView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>(); // contains hori_dist : node value
        queue.add(new Pair(0, root)); // adding horizontal distance and node

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int hori_dist = pair.hori_dist;
            TreeNode node = pair.node;

            if (!map.containsKey(hori_dist)) {
                map.put(hori_dist, node.val);
            }
            if (node.left != null) {
                queue.add(new Pair(hori_dist - 1, node.left));
            }
            if (node.right != null) {
                queue.add(new Pair(hori_dist + 1, node.right));
            }
        }
        for (int value : map.values()) {

            result.add(value);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
