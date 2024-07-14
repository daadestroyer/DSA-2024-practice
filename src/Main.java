import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String[] testCases = {"madam", "racecar", "hello", "", "a", "ab", "aa", "aba"};
        for (String str : testCases) {
            System.out.println("Is \"" + str + "\" a palindrome? " + checkPallindrome(str, 0, str.length() - 1));
        }
    }

    private static boolean checkPallindrome(String str, int lo, int hi) {
        if (lo > hi) {
            return true;
        }
        if(str.charAt(lo)!=str.charAt(hi)){
            return false;
        }
        return checkPallindrome(str,lo+1,hi-1);
    }
}