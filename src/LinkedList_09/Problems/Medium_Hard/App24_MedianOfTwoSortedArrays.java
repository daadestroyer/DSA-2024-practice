package LinkedList_09.Problems.Medium_Hard;

public class App24_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[n + m];

        int i = 0; 
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < n) {
            merged[k++] = nums1[i++];
        }
        while (j < m) {
            merged[k++] = nums2[j++];
        }

        int total = n + m;
        if (total % 2 == 1) { // 1 2 3 4
            return merged[total / 2];
        } else {
            int mid1 = merged[(total / 2) - 1];
            int mid2 = merged[total / 2];

            return (mid1 + mid2) / 2.0;
        }
    }

    public static void main(String[] args) {

    }
}
