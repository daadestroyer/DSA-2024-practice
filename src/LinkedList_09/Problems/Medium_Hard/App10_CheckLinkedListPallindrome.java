package LinkedList_09.Problems.Medium_Hard;

public class App10_CheckLinkedListPallindrome {
    public static void main(String[] args) {
        /*
            public static ListNode reverse(ListNode head){
                ListNode prev = null;
                ListNode ptr = head;
                while(ptr != null){
                    ListNode nextNode = ptr.next;
                    ptr.next = prev;
                    prev = ptr;
                    ptr = nextNode;
                }
                return prev;
            }
            public boolean isPalindrome(ListNode head) {
                if (head == null || head.next == null) {
                    return true; // A single node or empty list is always a palindrome
                }
                ListNode slow = head;
                ListNode fast = head;
                while(fast != null && fast.next != null){
                    slow = slow.next;
                    fast = fast.next.next;
                }
                ListNode secondHalf = reverse(slow);

                ListNode firstHalf = head;

                while(secondHalf != null){
                    if(secondHalf.val != firstHalf.val){
                        return false;
                    }
                    firstHalf = firstHalf.next;
                    secondHalf = secondHalf.next;
                }
                return true;
            }
        */
    }
}
