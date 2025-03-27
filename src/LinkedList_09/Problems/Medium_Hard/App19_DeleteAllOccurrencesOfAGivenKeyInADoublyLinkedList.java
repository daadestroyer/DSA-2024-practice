package LinkedList_09.Problems.Medium_Hard;

/*
2<->2<->10<->8<->4<->2<->5<->2
key = 2
output : 10<->8<->4<->5


*/
public class App19_DeleteAllOccurrencesOfAGivenKeyInADoublyLinkedList {
    public static void main(String[] args) {
        /*
                public static Node deleteNode(Node head , Node curr){
                        if(head == null || curr == null){
                            return null;
                        }
                        // if we are deleting first node
                        if(curr == head){
                            head = curr.next;
                            head.prev = null;
                        }
                        // if we are deleting last node
                        else if(curr.next == null){
                            curr.prev.next = null;
                        }
                        else{
                            curr.prev.next = curr.next;
                            curr.next.prev = curr.prev;
                        }

                        return head;

                }
                static Node deleteAllOccurOfX(Node head, int x) {
                    if(head == null){
                        return null;
                    }
                    Node curr = head;


                    while(curr != null){
                        if(curr.data == x){
                            head = deleteNode(head,curr);
                        }
                        curr = curr.next;
                    }
                    return head;
                }
        */
    }

}
