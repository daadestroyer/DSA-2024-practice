package LinkedList_09.Problems.Medium_Hard;

import java.util.ArrayList;

public class App21_RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        /*
            public Node removeDuplicates(Node head){
                if(head == null){
                    return null;
                }
                Node curr = head.next; // point current to 2nd node

                // then keep on comparing current and current-1 node
                while(curr != null){
                    if(curr.prev.data == curr.data){
                        curr.prev.next = curr.next; // remove the backlink of current node

                        if(curr.next != null){ // remove the front link of current node
                            curr.next.prev = curr.prev;
                        }
                    }
                    curr = curr.next;
                }
                return head;
            }
        */
    }
}
