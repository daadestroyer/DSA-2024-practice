package Stack_Queue_10.Problems;

import java.util.Stack;

public class App03_RemoveOuterParanthesis {
    public static String removeOuterParanthesis(String s) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (st.size() > 0) {
                    sb.append(c);
                }
                st.push(c);
            } else {
                st.pop();
                if (st.size() > 0) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParanthesis(s));
    }
}
