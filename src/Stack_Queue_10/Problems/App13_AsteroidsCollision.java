package Stack_Queue_10.Problems;

import java.util.Arrays;
import java.util.Stack;

public class App13_AsteroidsCollision {
    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() > 0 && asteroids[i] < 0) {
                int sum = st.peek() + asteroids[i];
                if (sum < 0) {
                    st.pop(); // means left asteroid which is present in stack is weaker than incoming which is right one
                    // so left one get destroyed
                } else if (sum > 0) { // means left asteroid which is present in stack is stronger than incoming which is right one
                    // so right one get destroyed so marked as 0 which we will not consider
                    asteroids[i] = 0;
                } else { // means both the asteroid of same power so both get destroyed
                    st.pop();
                    asteroids[i] = 0;
                }
            }
            if (asteroids[i] != 0) {
                st.push(asteroids[i]);
            }
        }
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        System.out.println(Arrays.toString(res));
    }
}
