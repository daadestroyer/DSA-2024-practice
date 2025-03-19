package LinkedList_09.implementation;

public class App_Main {
    public static void main(String[] args) {
        LinkedListImplementation linkedlist = new LinkedListImplementation();
        linkedlist.addAtFirst(10);
        linkedlist.addAtFirst(20); // 20, 10
        linkedlist.addAtLast(30);
        linkedlist.addAtLast(40);  // 20, 10, 30, 40
        System.out.println(linkedlist.currentSize());
        linkedlist.display();
        System.out.println();

        System.out.println("------");

        System.out.println("First : "+linkedlist.getFirst());
        System.out.println("Last : "+linkedlist.getLast());

        System.out.println("------");

        System.out.println("First : "+linkedlist.deleteAtFirst());
        linkedlist.display();

        System.out.println();
        System.out.println("Last : "+linkedlist.deleteAtLast());
        linkedlist.display();

        System.out.println();
        System.out.println(linkedlist.isEmpty());
        System.out.println();
        System.out.println("Last : "+linkedlist.deleteAtLast());
        System.out.println("Last : "+linkedlist.deleteAtLast());
        System.out.println("Last : "+linkedlist.deleteAtLast());
    }
}
