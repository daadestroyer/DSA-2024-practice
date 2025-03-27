package LinkedList_09.Problems.Medium_Hard;

public class App18_AddTwoLinkedListValuesTogether {
    public static void main(String[] args) {
        /*
            public Node addTwoLinkedList(Node l1, Node l2){
                Node dummyNode = new Node();
                Node temp = dummyNode;

                while(l1 != null || l2 != null){
                    int sum = 0;
                    if(l1 != null){
                        sum = sum + l1.val;
                        l1 = l1.next;
                    }
                    if(l2 != null){
                        sum = sum + l2.val;
                        l2 = l2.next;
                    }
                    // add the value of carry into your sum
                    sum = sum + carry;
                    carry = sum / 10; // 19 --> 1

                    Node node = new Node();
                    node.val = sum % 10;
                    temp.next = val;
                    temp = temp.next;
                }
                // if carry still left just create one node and add at end of linkedlist
                if(carry == 1){
                   Node node = new Node();
                   node.val = 1;
                   temp.next = node;
                   temp = temp.next;
                }
                return dummyNode.next; // returning dummy.next because dummyNode is simply a empty value node
                                        // and we started created node from next of it
            }
        */


    }
}

