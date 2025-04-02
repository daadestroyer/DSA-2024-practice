package Stack_Queue_10.Problems;

import java.util.Arrays;
import java.util.Stack;

public class App08_PreviousSmallerElement {
    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 4, 3, 1, 5};

        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];

        // increasing monotonic stack
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));

    }
}
