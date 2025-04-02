package Stack_Queue_10.Implementation;

import java.util.Deque;
import java.util.LinkedList;

class MyStack {
    private Deque<Integer> dq;

    public MyStack() {
        dq = new LinkedList<>();
    }

    public boolean isEmpty() {
        return dq.isEmpty();
    }

    public void push(int data) {
        dq.addFirst(data);
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        }
        return dq.removeFirst();
    }

    public int peek() {
        if (this.isEmpty()) {
            return -1;
        }
        return dq.peek();
    }

}

public class App03_ImplementStackUsingQueue {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());

    }
}
