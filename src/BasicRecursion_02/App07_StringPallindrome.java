package BasicRecursion_02;

public class App07_StringPallindrome {
    public static void main(String[] args) {
//        String s = "arora";
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(s);
        System.out.println(palindrome(0, s));
    }

    private static boolean palindrome(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return palindrome(i + 1, s);
    }
}
