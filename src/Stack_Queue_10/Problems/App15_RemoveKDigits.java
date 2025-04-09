package Stack_Queue_10.Problems;

import java.util.Stack;

/*
Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.



Example 1:
Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

*/
public class App15_RemoveKDigits {
    public static String removeKDigit(String num, int k) {
        Stack<Character> st = new Stack<>();
        int len = num.length();
        if (len == k) {
            return "0";
        }
        for (int i = 0; i < len; i++) {
            while (k > 0 && !st.isEmpty() && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        // edge case
        while (k > 0) {
            st.pop();
            k--;
        }
        StringBuffer sb = new StringBuffer();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKDigit(num, k));
    }
}
