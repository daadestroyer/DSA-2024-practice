package Stack_Queue_10.Problems;

import java.util.Stack;

/*

Input: nums = [1,2,3]
Output: 4
Explanation: The 6 sub arrays of nums are the following:
[1], range = largest - smallest = 1 - 1 = 0
[2], range = 2 - 2 = 0
[3], range = 3 - 3 = 0
[1,2], range = 2 - 1 = 1
[2,3], range = 3 - 2 = 1
[1,2,3], range = 3 - 1 = 2
So the sum of all ranges is 0 + 0 + 0 + 1 + 1 + 2 = 4.

*/
public class App14_SumOfSubArrayRanges {
    public static int bruteForce(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int min = nums[i];
            int max = nums[i];

            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                sum += (max - min);
            }
        }
        return sum;
    }

    public static long optimalApproach(int[] nums) {
        int n = nums.length;
        int[] leftmin = new int[n];
        int[] rightmin = new int[n];
        Stack<Integer> st = new Stack();
        // compute PSE
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                leftmin[i] = i + 1;
            } else {
                leftmin[i] = i - st.peek();
            }
            st.push(i);
        }
        st.clear();

        // compute NSE
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                rightmin[i] = n - i;
            } else {
                rightmin[i] = st.peek() - i;
            }
            st.push(i);
        }
        st.clear();

        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        // How many subarrays consider an element as the maximum
        // compute PGE
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                leftmax[i] = i + 1;
            } else {
                leftmax[i] = i - st.peek();
            }
            st.push(i);
        }
        st.clear();
        // compute NGE
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                rightmax[i] = n - i;
            } else {
                rightmax[i] = st.peek() - i;
            }
            st.push(i);
        }

        // compute final answer
        long sumMax = 0, sumMin = 0;
        for (int i = 0; i < n; i++) {
            sumMax += (long) nums[i] * leftmax[i] * rightmax[i];
            sumMin += (long) nums[i] * leftmin[i] * rightmin[i];
        }
        return sumMax - sumMin;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        //   System.out.println(bruteForce(nums));
        System.out.println(optimalApproach(nums));
    }
}
