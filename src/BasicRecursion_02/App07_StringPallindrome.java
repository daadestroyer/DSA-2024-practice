package BasicRecursion_02;

public class App07_StringPallindrome {
    public static void main(String[] args) {
//        String s = "arora";
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(s);
//        System.out.println(palindromeway1(0, s));
        System.out.println(palindromeway2(s,0,s.length()-1));
    }

    private static boolean palindromeway2(String s, int lo, int hi) {
        if(lo > hi){
            return true;
        }
        if(s.charAt(lo) != s.charAt(hi)){
            return false;
        }
        return palindromeway2(s,lo+1,hi-1);
    }

    private static boolean palindromeway1(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return palindromeway1(i + 1, s);
    }
}
