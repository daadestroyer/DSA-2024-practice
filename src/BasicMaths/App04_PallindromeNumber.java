package BasicMaths;

public class App04_PallindromeNumber {

    public boolean isPalindrome(int x) {
        int pallindrome_no = 0;
        int original_no = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            pallindrome_no = pallindrome_no * 10 + lastDigit;
            x = x / 10;
            if (pallindrome_no > Integer.MAX_VALUE || pallindrome_no < Integer.MIN_VALUE) {
                return false;
            }
        }
        return original_no == pallindrome_no ? true : false;
    }

    public static void main(String[] args) {
        App04_PallindromeNumber app = new App04_PallindromeNumber();

    }
}
