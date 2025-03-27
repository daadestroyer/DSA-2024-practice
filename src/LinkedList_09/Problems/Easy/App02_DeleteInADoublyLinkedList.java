package LinkedList_09.Problems.Easy;

public class App02_DeleteInADoublyLinkedList {
    public static void main(String[] args) {
        /*
        public Node deleteNode(Node head, int pos) {
            if(head == null || head.next == null){
                return null;
            }
            if(pos == 1){
                head = head.next;
                head.prev = null;
                return head;
            }
            Node ptr = head;
            for(int i=1 ; i<pos ; i++){
                ptr = ptr.next;
            }
            // last node
            if(ptr.next == null){
                ptr.prev.next = null;
                return head;
            }
            // middle node
            else{
                ptr.prev.next = ptr.next;
                ptr.next.prev = ptr.prev;
                return head;
            }
        }
         */
    }
}
