package Tree_13.BinaryTree;

import java.util.*;

public class App14_BottomViewOfBinaryTree_GFG {
    class Pair{
        int hori_dist;
        TreeNode node;
        Pair(int hori_dist,TreeNode node){
            this.hori_dist = hori_dist;
            this.node = node;
        }
    }
    // Function to return a list containing the bottom view of the given tree.
    public ArrayList<Integer> bottomView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        queue.add(new Pair(0,root));

        while(!queue.isEmpty()){
            Pair pair = queue.poll();
            int hori_dist = pair.hori_dist;
            TreeNode node = pair.node;

            map.put(hori_dist,node.val);

            if(node.left != null){
                queue.add(new Pair(hori_dist-1,node.left));
            }
            if(node.right != null){
                queue.add(new Pair(hori_dist+1,node.right));
            }
        }
        result.addAll(map.values());
        return result;
    }
    public static void main(String[] args) {

    }
}
