package Strings_07;

public class App01_RemoveOuterMostParentheses_1021 {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        StringBuffer sb = new StringBuffer();
        int opened = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (opened > 0) {
                    sb.append(c);
                }
                opened++;

            } else {
                if (opened > 1) {
                    sb.append(c);
                }
                opened--;

            }
        }
        System.out.println(sb.toString());
        /*
            (()())+(())+(()(()))
            op : ()()()()(())
        */
    }
}
