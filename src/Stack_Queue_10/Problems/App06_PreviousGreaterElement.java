package Stack_Queue_10.Problems;

import java.util.Arrays;
import java.util.Stack;

public class App06_PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 4, 3, 1, 5};
        int n = arr.length;
        int[] res = new int[n]; // Array to store previous greater elements
        Stack<Integer> stack = new Stack<>(); // Stack to store elements

        // Monotonic decreasing Stack
        for (int i = 0; i < n; i++) {
            // Pop elements from the stack while the current element is greater or equal
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            // If the stack is empty, there is no greater element on the left
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek(); // The top of the stack is the previous greater element
            }
            // Push the current element onto the stack
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(res)); // Output the result
    }
}