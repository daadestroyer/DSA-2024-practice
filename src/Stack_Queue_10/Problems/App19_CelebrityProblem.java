package Stack_Queue_10.Problems;

import java.util.Stack;

public class App19_CelebrityProblem {
    public static int findCelebrity(int[][] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int celebrity = 0;
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() >= 2) {
            int i = st.pop();
            int j = st.pop();

            if (arr[i][j] == 1) {
                // means i knows j, but j don't know i meaning j is celebrity put him back to stack
                st.push(j);
            } else {
                // means j knows i, but i don't know j meaning i is celebrity put him back to stack
                st.push(i);
            }
        }
        celebrity = st.pop();
        for (int i = 0; i < n; i++) {
            if (i != celebrity) {
                if (arr[i][celebrity] == 0 && arr[celebrity][i] == 1) {
                    return -1;
                }
            }
        }
        return celebrity;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1, 0},
                {1, 0, 1, 0},
                {0, 0, 0, 0},
                {1, 1, 1, 0}
        };
        System.out.println(findCelebrity(arr));
    }
}
