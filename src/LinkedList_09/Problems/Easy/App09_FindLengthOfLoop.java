package LinkedList_09.Problems.Easy;

public class App09_FindLengthOfLoop {
    public static void main(String[] args) {
        /*
            public int lengthOfLoop(Node head){
                if(head == null || head.next == null){
                    return 0;
                }
                int count = 1
                Node slow = head;
                Node fast = head;

                while(fast != null && fast.next != null){
                    slow = slow.next;
                    fast = fast.next.next;

                    if(slow == fast){
                        break;
                    }
                }
                if(slow != fast){
                    return 0;
                }
                count++;
                fast = fast.next;
                while(slow != fast){
                    fast = fast.next;
                    count++;
                }
                return count;
            }
        */
    }
}
