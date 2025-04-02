package Stack_Queue_10.Problems;

import java.util.Stack;

public class App01_BalancedParenthesis {
    public static boolean balancedParanthesis(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if ((!st.isEmpty()) && (c == ')' && st.peek() == '(') ||
                        (c == '}' && st.peek() == '{') ||
                        (c == ']' && st.peek() == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(balancedParanthesis(s));
    }
}
