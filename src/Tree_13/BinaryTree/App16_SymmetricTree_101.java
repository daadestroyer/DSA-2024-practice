package Tree_13.BinaryTree;

public class App16_SymmetricTree_101 {

    static class Node {
        int val;
        Node left;
        Node right;

    }

    public static boolean isSymmetricTree(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null) {
            return false;
        } else if (root1.val != root2.val) {
            return false;
        } else {
            boolean leftRes = isSymmetricTree(root1.left, root2.right);
            boolean rightRes = isSymmetricTree(root1.right, root2.left);
            return leftRes && rightRes;
        }

    }

    public static void main(String[] args) {
        Node node = new Node();
        boolean res = isSymmetricTree(node.left, node.right);
    }
}
