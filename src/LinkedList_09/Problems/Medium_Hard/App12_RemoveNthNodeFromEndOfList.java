package LinkedList_09.Problems.Medium_Hard;

/*
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
 */
public class App12_RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        /*
            public Node removeNthNodeFromEnd(Node head, int n){
                Node slow = head;
                Node fast = head;

                // move fast n steps ahead
                for(int i=0 ; i<n ; i++){
                    fast = fast.next;
                }

                // check if fast == null, means we need to remove nth(keep n=5) from back
                // which is first node from start

                if(fast == null){
                    return head.next; // sending list back from 2nd node
                }

                // keep moving slow and fast until fast reaches at end
                while(fast.next != null){
                    slow = slow.next;
                    fast = fast.next;
                }
                slow.next = slow.next.next;
                return head;
            }
        */
    }
}
