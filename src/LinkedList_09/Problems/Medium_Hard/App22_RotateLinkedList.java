package LinkedList_09.Problems.Medium_Hard;
/*
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
*/
public class App22_RotateLinkedList {
    public static void main(String[] args) {
        /*
            public len findLen(Node head){
                int len = 0;
                Node ptr = head;
                while(ptr != null){
                    ptr = ptr.next;
                    len++;
                }
                return len;
            }
            public Node rotateRight(ListNode head, int k) {
                if(head == null || head.next == null || k == 0){
                    return head;
                }
                int len = findLen(head);
                k = k % len; // checking if k is in range of linkedlist length or not
                if(k == 0){
                    return head; // if k = 10, len = 5 means k = k % len is 0 means no rotation needed
                                // k is double of list len
                }
                Node ptr = head;
                for(int i=1 ; i<len - k -1; i++){
                    ptr = ptr.next;
                }
                Node newHead = ptr.next;
                ptr.next = null;
                Node newTail = newHead;
                while(newTail != null){
                    newTail = newTail.next;
                }
                newTail.next = head;
                return newHead;
            }
        */
    }
}
