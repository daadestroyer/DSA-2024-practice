package Tree_13.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App15_RightViewOfBinaryTree_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=1 ; i<=size ; i++){
                TreeNode curr = queue.poll();
                // if the level of tree and size of queue is same means we can consider that node as last node of this level
                if(i == size){
                    res.add(curr.val);
                }
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
