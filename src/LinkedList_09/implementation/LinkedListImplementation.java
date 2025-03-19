package LinkedList_09.implementation;

public class LinkedListImplementation {
    private class Node {
        int data;
        Node next;
    }

    int size;
    Node head;
    Node tail;

    public int currentSize() {
        return this.size;
    }

    public void display() {
        if (this.currentSize() == 0) {
            System.out.println("No data found");
            return;
        }
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }

    public void addAtFirst(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        if (this.currentSize() == 0) {
            this.head = this.tail = newnode;
            this.size++;
        } else {
            newnode.next = this.head;
            this.head = newnode;
            this.size++;
        }
    }

    public void addAtLast(int data) {
        Node newnode = new Node();
        newnode.data = data;
        if (this.currentSize() == 0) {
            this.head = this.tail = newnode;
            this.size++;
        } else {
            newnode.next = null;
            this.tail.next = newnode;
            this.tail = newnode;
            this.size++;
        }
    }

    public int getFirst() {
        if (this.currentSize() == 0) {
            System.out.println("no data found");
            return -1;
        } else {
            return this.head.data;
        }
    }

    public int getLast() {
        if (this.currentSize() == 0) {
            System.out.println("no data found");
            return -1;
        } else {
            return this.tail.data;
        }
    }

    public int deleteAtFirst() {
        if (this.currentSize() == 0) {
            System.out.println("no data found");
            return -1;
        }
        int rv = this.head.data;
        if (this.currentSize() == 1) {
            this.head = this.tail = null;
            this.size--;

        } else {
            this.head = this.head.next;
            this.size--;
        }
        return rv;
    }

    public int deleteAtLast() {
        if (this.currentSize() == 0) {
            System.out.println("no data found");
            return -1;
        }
        int rv = this.tail.data;
        if (this.currentSize() == 1) {
            this.head = this.tail = null;
            this.size--;
        } else {
            Node ptr = head;
            while (ptr.next.next != null) {
                ptr = ptr.next;
            }
            ptr.next = null;
            this.tail = ptr;
            this.size--;
        }
        return rv;
    }

    public boolean searchElement(int data) {
        if (this.currentSize() == 0) {
            System.out.println("no data found");
            return false;
        } else {
            Node ptr = head;
            while (ptr != null) {
                if (ptr.data == data) {
                    return true;
                }
                ptr = ptr.next;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        if (this.currentSize() == 0) {
            return true;
        }
        return false;
    }

}
