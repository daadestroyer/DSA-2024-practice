package Strings_07.Easy;

public class App03_LargestOddNumberInString_1903 {
    public static String findLargestOddNumber(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(s.charAt(i)) % 2 != 0) {
                return s.substring(0,i+1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "35427";
         // "52"
        // "23768"
        String res = findLargestOddNumber(s);
        System.out.println(res);
    }
}
