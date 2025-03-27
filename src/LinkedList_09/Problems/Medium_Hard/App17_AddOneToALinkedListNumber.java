package LinkedList_09.Problems.Medium_Hard;

public class App17_AddOneToALinkedListNumber {
    public static void main(String[] args) {
        /*
            public Node addNode(Node head){
                if(head == null){
                    return head;
                }
                head = reverseList(head);
                Node temp = head;
                int carry = 1;

                while(temp != null){
                    temp.data = temp.data + carry;
                    if(temp.data < 10){
                        carry = 0;
                        break;
                    }
                    else{
                        temp.data = 0;
                        carry = 1;
                    }
                }
                if(carry == 1){
                    Node newHead = new Node(1);
                    newHead.next = head;
                    return newHead;
                }
                head = reverseList(head);
                return head;
            }
        */
    }
}
