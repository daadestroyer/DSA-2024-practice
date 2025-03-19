package BinarySearch_08.Medium_BSOnAnswers;

public class App05_KthMissingPositiveNumber {
    public static boolean isContains(int counter, int[] arr) {
        for (int i : arr) {
            if (i == counter) {
                return true;
            }
        }
        return false;
    }

    public static int findKthPositive(int[] arr, int k) {
        int number = 1;
        int missingTillNow = 0;
        while (true) {
            if (!isContains(number, arr)) {
                missingTillNow++;
            }
            if (missingTillNow == k) {
                return number;
            }
            number++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11}; // find kth missing no
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }
}
