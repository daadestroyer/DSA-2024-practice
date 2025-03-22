package LinkedList_09.Problems;

public class App08_ReturnNodeWhereCycleBegins {
    public static void main(String[] args) {
        /*
            public Node findPositionWhereLoopStart(Node head){
                if(head == null || head.next == null){
                    return null;
                }
                Node slow = head;
                Node fast = head;

                while(fast != null && fast.next != null){
                    slow = slow.next;
                    fast = fast.next.next;

                    if(slow == fast){
                        return break;
                    }
                }
                if(slow != fast){
                    return null; // if slow and fast never meet means there is no cycle
                }
                slow = head;

                while(slow != fast){
                    slow = slow.next
                    fast = fast.next;
                }
                return slow;
            }

        */
    }
}
