package Stack_Queue_10.Problems;

import java.util.Arrays;
import java.util.Stack;

public class App05_NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n]; // Array to store next greater elements

        // monotonic decreasing stack
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            // Push the current element to the stack
            st.push(arr[i]);

        }
        System.out.println(Arrays.toString(res));
    }
}
