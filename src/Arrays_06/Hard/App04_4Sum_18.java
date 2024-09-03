package Arrays_06.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App04_4Sum_18 {
    static List<List<Integer>> bruteForce(int[] A, int target) {
        int n = A.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (A[i] + A[j] + A[k] + A[l] == target) {
                            res.add(Arrays.asList(A[i], A[j], A[k], A[l]));
                        }
                    }
                }
            }
        }
        return res;
    }

    static List<List<Integer>> optimizedApproach(int[] A, int target) {
        int n = A.length;
        if (A == null || n == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(A);

        for (int i = 0; i < n - 3; i++) {
            // avoiding duplicates for i
            if (i == 0 || A[i] != A[i - 1]) {
                for (int j = i + 1; j < n - 2; j++) {
                    // avoiding duplicates for j
                    if (j == i + 1 || A[j] != A[j - 1]) {
                        int target2 = target - A[i] - A[j];
                        int left = j + 1;
                        int right = n - 1;
                        while (left < right) {
                            int sum = A[left] + A[right];

                            if (sum == target2) {
                                res.add(Arrays.asList(A[i], A[j], A[left], A[right]));

                                // avoid duplicates of left
                                while (left < right && A[left] == A[left - 1]) {
                                    left++;
                                }
                                while (left < right && A[right] == A[right - 1]) {
                                    right--;
                                }
                                left++;
                                right--;
                            } else if (sum > target2) {
                                right--;
                            } else {
                                left++;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        // List<List<Integer>> res = bruteForce(nums, target);
        // System.out.println(res);
        List<List<Integer>> res = optimizedApproach(nums, target);
        System.out.println(res);
    }
}
