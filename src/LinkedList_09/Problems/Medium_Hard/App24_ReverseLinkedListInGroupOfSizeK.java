package LinkedList_09.Problems.Medium_Hard;


public class App24_ReverseLinkedListInGroupOfSizeK {
/*
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy, nex = dummy, pre = dummy;

        // Count the length of the linked list
        int count = 0;
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        // Reverse in groups
        while (count >= k) {
            curr = pre.next;
            nex = curr.next;
            for (int i = 1; i < k; i++) {
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            pre = curr;
            count -= k;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }


 */

    public static void main(String[] args) {
        for(int i=1 ; i<3 ;i++){
            System.out.println("helolo");
        }
    }
}
