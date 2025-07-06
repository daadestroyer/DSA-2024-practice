package Tree_13.BinarySearchTree;

public class App02_Ceil_In_BST {

    static class Node {
        int data;
        Node left;
        Node right;
    }

    private static int findCeil(Node node, int key) {
        int ceil = -1;
        while (node != null) {
            if (node == null) {
                return -1;
            }
            if (node.data == key) {
                return node.data;
            } else if (key < node.data) {
                ceil = node.data;
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return ceil;
    }

    public static void main(String[] args) {
        Node node = new Node();
        int res = findCeil(node, 2);
    }


}
