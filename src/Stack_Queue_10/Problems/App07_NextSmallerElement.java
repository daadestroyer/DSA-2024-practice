package Stack_Queue_10.Problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class App07_NextSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int n = arr.length;
        int[] res = new int[n];  // Array to store next smaller elements
        Stack<Integer> stack = new Stack<>(); // Stack to store elements

        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack while they are greater than or equal to the current element
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no smaller element exists
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                // The next smaller element is at the top of the stack
                res[i] = stack.peek();
            }

            // Push the current element to the stack
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));

    }
}
