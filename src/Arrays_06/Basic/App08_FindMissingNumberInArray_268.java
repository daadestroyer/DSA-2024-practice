package Arrays_06.Basic;

public class App08_FindMissingNumberInArray_268 {
    public static void main(String[] args) {
        /*
          n = size of array
          all array elements will be in range on n
          so, just calculate the sum of n numbers and subtract with the sum of elements present in array
         */

        int[] nums = {3,0,1};
        int n = nums.length;
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int missingNumber = n * (n + 1) / 2 - sum;
        System.out.println(missingNumber);

    }
}
