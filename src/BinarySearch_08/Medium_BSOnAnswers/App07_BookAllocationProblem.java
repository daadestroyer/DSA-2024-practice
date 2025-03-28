package BinarySearch_08.Medium_BSOnAnswers;

import java.util.Arrays;

public class App07_BookAllocationProblem {
    static int countStudent(int[] arr, int pages) {
        int n = arr.length;
        int studentsAlloted = 1;
        int pagesAlloted = 0;
        for (int i = 0; i < n; i++) {
            if (pagesAlloted + arr[i] <= pages) {
                pagesAlloted += arr[i];

            } else {
                studentsAlloted++;
                pagesAlloted = arr[i];
            }
        }
        return studentsAlloted;
    }

    static int findPagesBruteForce(int[] arr, int noOfBooks, int noOfStudent) {
        if (noOfStudent > noOfBooks) {
            return -1;
        }
        int n = arr.length;
        int minPages = Arrays.stream(arr).map(i -> i).max().getAsInt();
        int maxPages = Arrays.stream(arr).map(i -> i).sum();
        for (int pages = minPages; pages <= maxPages; pages++) {
            if (countStudent(arr, pages) == noOfStudent) {
                return pages;
            }
        }
        return minPages;
    }

    public static int findPagesOptimal(int[] arr, int noOfBooks, int noOfStudent) {
        if (noOfStudent > noOfBooks) {
            return -1;
        }
        int minPages = Arrays.stream(arr).max().getAsInt(); // So, minPages = max(arr[]) ensures that at least one student can be assigned the largest book.
        int maxPages = Arrays.stream(arr).sum(); // So, maxPages = sum(arr[]) represents the absolute upper bound when only one student gets all books.
        while (minPages <= maxPages) {
            int midPages = (minPages + maxPages) / 2;
            if (countStudent(arr, midPages) > noOfStudent) {
                minPages = midPages + 1;
            } else {
                maxPages = midPages - 1;
            }
        }
            return minPages;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int noOfBooks = 4;
        int noOfStudent = 2;
        // System.out.println(findPagesBruteForce(arr, noOfBooks, noOfStudent));
        System.out.println(findPagesOptimal(arr, noOfBooks, noOfStudent));



    }
}
