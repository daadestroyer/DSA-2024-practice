package BinarySearch_08.Basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App01_BinarySearchToFindXInSorterArray_704 {
    static int usingInBuildFunction(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int res = Collections.binarySearch(list, target);
        return res >= 0 ? res : -1;
    }

    static int binarySearch(int[] nums, int target) {
        int low = 0;
        int hi = nums.length - 1;

        while (low <= hi) {
            int mid = (low + hi) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        // int res = usingInBuildFunction(arr, target);
        int res = binarySearch(arr, target);
        System.out.println(res);
    }
}
