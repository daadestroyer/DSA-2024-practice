package Strings_07.Easy;

public class App06_RotateString_796 {

    public static boolean checkRotateString(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        sb.append(s);

        if(sb.toString().contains(goal)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(checkRotateString(s,goal));
    }
}
