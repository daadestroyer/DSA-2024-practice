package LinkedList_09.Problems.Medium_Hard;

public class App23_FlatteningOfLinkedList {
    public static void main(String[] args) {
        /*
            public Node flatteningLinkedList(Node root){
                ArrayList<Integer> list = new ArrayList<>();
                Node ptr = head;
                while(ptr != null){
                    Node ptrBottom = ptr;
                    while(ptrBottom != null){
                        list.add(ptrBottom.data);
                        ptrBottom = ptrBottom.bottom;
                    }
                    ptr = ptr.next;
                }
                Collections.sort(list);
                Node dummy = new Node(0);
                Node temp = dummy;
                for(int val : list){
                    temp.bottom =  new Node(temp.data);
                    temp = temp.bottom;
                }
                return dummy.bottom;
            }
        */
    }
}
