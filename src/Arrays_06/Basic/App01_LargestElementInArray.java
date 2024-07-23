package Arrays_06.Basic;

public class App01_LargestElementInArray {
    public static void main(String[] args) {
        // TC:O(N) SC:O(1)
        int[] arr = {1, 8, 7, 56, 90};
        int largestElement = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > largestElement){
               largestElement = i;
            }
        }
        System.out.println(largestElement);

    }
}
