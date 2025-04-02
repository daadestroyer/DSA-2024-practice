package Stack_Queue_10.Problems;

import java.util.Stack;

// what we gonna do is, we just not simply store the number in stack
// we store a node object which gonna contains two things
// one is the current data of node
// second is the min val till now
// so that which ever node present at stack top contains min val till now
class MinStack {
    Stack<Node> st;

    class Node {
        private int val;
        private int minVal;

        public Node(int val, int minVal) {
            this.val = val;
            this.minVal = minVal;
        }
    }

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        // if stack is empty then simply put the data
        if (st.isEmpty()) {
            st.push(new Node(val, val));
        } else {
            // first find the min val by comparing current elem and st top node which having min element till now
            int minVal = Math.min(val, st.peek().minVal);
            st.push(new Node(val, minVal));
        }
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().val;
    }

    public int getMin() {
        return st.peek().minVal;
    }

}

public class App02_ImplementedMinStack {

}
