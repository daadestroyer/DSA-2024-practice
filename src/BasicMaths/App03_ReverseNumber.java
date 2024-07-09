package BasicMaths;

public class App03_ReverseNumber {
    public static int reverse(int x) {
        long revNo = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            revNo = revNo * 10 + lastDigit;
            x = x / 10;

            // while reversing no we should check everytime that if revNo is not in range of Integer than we should return 0
            if(revNo > Integer.MAX_VALUE || revNo < Integer.MIN_VALUE){
                return 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // case - 1 normal input
        System.out.println(reverse(123));


        // case - 2 giving input which is out of integer range
    }
}
