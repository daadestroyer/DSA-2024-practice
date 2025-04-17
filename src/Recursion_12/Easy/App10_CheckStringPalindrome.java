package Recursion_12.Easy;

public class App10_CheckStringPalindrome {
    public static boolean checkPalinrome(String s,int lo , int hi){
        if(lo > hi){
            return true;
        }
        if(s.charAt(lo) != s.charAt(hi)){
            return false;
        }
        return checkPalinrome(s,lo+1,hi-1);
    }
    public static void main(String[] args) {
        String s = "arora";
        System.out.println(checkPalinrome(s,0,s.length()-1));
    }
}
