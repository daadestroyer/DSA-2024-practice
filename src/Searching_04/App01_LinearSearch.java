package Searching_04;

public class App01_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 9, 10, 8};
        int element = 8;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
