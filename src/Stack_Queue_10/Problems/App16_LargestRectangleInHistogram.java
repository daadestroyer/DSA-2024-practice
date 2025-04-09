package Stack_Queue_10.Problems;

import java.util.Stack;

public class App16_LargestRectangleInHistogram {
    public static int largestRectangleInHistogram(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxA = 0;
        int[] leftSmallest = new int[n];
        // creating PSE
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                leftSmallest[i] = 0;
            } else {
                leftSmallest[i] = st.peek() + 1;
            }
            st.push(i);
        }
        st.clear();

        // creating NSE
        int[] rightSmallest = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                rightSmallest[i] = n - 1;
            } else {
                rightSmallest[i] = st.peek() - 1;
            }
            st.push(i);
        }
        // calculation area
        for (int i = 0; i < n; i++) {
            maxA = Math.max(maxA, (rightSmallest[i] - leftSmallest[i] + 1) * heights[i]);
        }
        return maxA;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleInHistogram(heights));
    }
}
