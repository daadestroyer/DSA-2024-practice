package Arrays_06.Hard;

import java.util.Arrays;

public class App07_MergeTwoSortedArrayWithoutExtraSpace_88 {
    static void mergeArray(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length - 1;
        int left = m - 1;
        int right = n - 1;
        while (left >= 0 && right >= 0) {
            if (nums2[right] > nums1[left]) {
                nums1[k--] = nums2[right--];
            } else {
                nums1[k--] = nums1[left--];
            }
        }
        while (left >= 0) {
            nums1[k--] = nums1[left--];
        }
        while (right >= 0) {
            nums1[k--] = nums2[right--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        mergeArray(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
