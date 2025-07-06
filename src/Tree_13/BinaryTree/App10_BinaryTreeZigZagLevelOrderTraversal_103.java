package Tree_13.BinaryTree;

import java.util.*;

public class App10_BinaryTreeZigZagLevelOrderTraversal_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 1;
        while(!q.isEmpty()){
            List<Integer> curr_res = new ArrayList<>();
            int size = q.size();
            for(int i=0 ; i<size ; i++){
                TreeNode node = q.poll();
                if(node != null){
                    curr_res.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(!curr_res.isEmpty()){
                if(level % 2 == 0){
                    Collections.reverse(curr_res);
                }
                res.add(curr_res);
            }
            level++;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
