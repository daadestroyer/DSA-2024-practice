package LinkedList_09.Problems;

public class App07_DetectLoopInLinkedList {
    public static void main(String[] args) {
        /*
            public Node detectLoopInLinkedList(Node head){
                Node slow = head;
                Node fast = head;

                // we are using fast in while loop because fast is moving fast than slow
                // if fast encounter null will stop there
                // obviously slow is behind fast

                while(fast != null && fast.next != null){
                    slow = slow.next;
                    fast = fast.next.next;

                    if(slow == fast){
                    return true;
                    }
                }
                return false;
            }
        */
    }
}
