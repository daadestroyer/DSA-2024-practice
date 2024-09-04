package Arrays_06.Hard;

import java.util.Arrays;
import java.util.HashSet;

public class App08_FindRepeatingAndMissingNumber_GFG {
    static int[] approach1(int[] arr , int n){
        int repeated = 0;
        int missing = 0;
        HashSet<Integer> hs = new HashSet<>();

        // repeated
        for (int i = 0; i < n; i++) {
            if (!hs.contains(arr[i])) {
                hs.add(arr[i]);
            } else {
                repeated = arr[i];
            }
        } // hs -> 2
        // missing
        for (int i = 1; i <= n; i++) {
            if(!hs.contains(i)){
                missing = i;
            }
        }
        return new int[]{repeated,missing};
    }
    public static void main(String[] args) {
        int n = 2;
        int arr[] = {2, 2};
        int[] res = approach1(arr, n);
        System.out.println(Arrays.toString(res));
    }
}
