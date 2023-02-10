package com.m2code.binary_search;

/**
 * Ceiling of a number  means a number which is greater than given number,
 * but it is smallest among all other number greater or equal than given number
 */
public class Ceiling_Number {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 10, 14, 25, 56};
        /**           0  1  2  3  4    5   6  */
        int target = 5;
        int ceiling = ceiling(arr, target);
        if (ceiling != -1) {
            System.out.println(arr[ceiling]);
        } else {
            System.out.println("NOT_FOUND");
        }
    }

    private static int ceiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        } else {
            int start = 0, end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return start;
        }
    }
}
