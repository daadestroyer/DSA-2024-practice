package Stack_Queue_10.Problems;

import java.util.Stack;

public class App12_SumOfSubArrayMinimum {
    public static int bruteForce(int[] arr) {
        int n = arr.length;
        int sum = 0;
        final int MOD = 1_000_000_007; // Correct way to define 10^9 + 7

        for (int i = 0; i < n; i++) {
            int minVal = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                minVal = Math.min(minVal, arr[j]);
                sum = (sum + minVal) % MOD; // Apply modulo to prevent overflow
            }
        }
        return (int) sum;
    }

    public static int optimalApproach(int[] arr) {
        int MOD = 1_000_000_007;
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] left = new int[n]; // PSE
        int[] right = new int[n]; // NSE

        // Compute Previous Smaller Element (PSE) count
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) { // 	If the stack is empty, it means that arr[i] is the smallest element encountered so far.
                left[i] = i + 1; // It can contribute as the minimum to all subarrays from the start of the array up to i.
                // the count is (i + 1), which means all i + 1 elements (from 0 to i) form valid subarrays
                // where arr[i] is the minimum.
            } else {
                left[i] = i - st.peek(); // previous smaller element at stack.peek(), which means that arr[i] can be the  minimum only in subarrays starting after that index.
            }
            st.push(i);
        }

        // Clear stack before computing NSE
        st.clear();

        // Compute Next Smaller Element (NSE) count
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) { // If the stack is empty, it means arr[i] is the smallest element among the remaining elements.
                right[i] = n - i; // It can contribute to all subarrays starting from i to the end of the array.
            } else {
                right[i] = st.peek() - i; // it means there is a smaller element at stack.peek(), which means arr[i] can be the minimum only until that index.
            }
            st.push(i); // ✅ FIX: Push the index into the stack
        }

        // Compute the final answer using contribution formula
        long result = 0;
        for (int i = 0; i < n; i++) {
            result = (result + (long) arr[i] * left[i] * right[i]) % MOD;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int n = arr.length;
        //  bruteForce(arr); // O(n)^
        System.out.println(optimalApproach(arr));


    }
}
