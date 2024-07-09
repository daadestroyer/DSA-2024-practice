package BasicMaths_01;

public class App06_ArmstrongNo {

    static boolean findArmstrong(int num) {
        int power = Integer.toString(num).length();
        int originalNo = num;
        int armstrongNo = 0;
        while(num != 0){
            int lastDigit = num % 10;
            armstrongNo += Math.pow(lastDigit,power);
            num /= 10;
        }
        return armstrongNo == originalNo ? true : false;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println(findArmstrong(num));
    }
}
