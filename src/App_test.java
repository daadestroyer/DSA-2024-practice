import java.util.Arrays;

public class App_test {
    public static void main(String[] args) {

        String[] s = {"flower","flow","flight"};
        Arrays.sort(s, (str1, str2) -> str1.length() - str2.length());
        System.out.println(Arrays.toString(s));
        String original = s[0]; // flow
        String temp = "";
        int ptr = 0;
        while (ptr < original.length()) {
            temp = original.substring(0, ptr+1);
            System.out.println(temp);
            ptr++;
        }

    }
}
