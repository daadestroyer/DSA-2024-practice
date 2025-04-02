package Stack_Queue_10.Implementation;

import java.util.Stack;

class MyQueue {
    private Stack<Integer> st;
    private Stack<Integer> temp;

    public MyQueue() {
        this.st = new Stack<Integer>();
        this.temp = new Stack<Integer>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        // first remove all element from main stack and put in temp
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        // the last element(a front element in terms of queue) is
        // now present at top in temp stack
        // remove that
        int rv = temp.pop();

        // put all the temp elemenets back to st
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        return rv;
    }

    public int peek() {
        // need to get most lower element from stack
        // it's actually a front element interms of queue
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        int ele = temp.peek();
        // store all elements back to main stack
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
        return ele;
    }

    public boolean empty() {
        return st.size() == 0;
    }
}

public class App04_ImplementQueueUsingStack {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());

    }
}
