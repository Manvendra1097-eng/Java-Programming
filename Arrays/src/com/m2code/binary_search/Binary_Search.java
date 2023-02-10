package com.m2code.binary_search;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {12, 45, 56, 89, 90};
        int target = 56;
/**
 int index = binarySearch(arr, target);
 System.out.println("Index for target " + target + " is " + index);
 int index_reversal = binarySearchReverse(new int[]{90, 89, 56, 45, 12}, target);
 System.out.println("Index for revers order " + index_reversal);
 */

        int index = binarySearchAgnostic(arr, 0, arr.length - 1, target);
        System.out.println("Index for target " + target + " is " + index);
        int index_reversal = binarySearchAgnostic(new int[]{90, 89, 56, 45, 12}, 0, 4, target);
        System.out.println("Index for revers order " + index_reversal);
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            /** to avoid overflow of integer value we used this approach */
            int mid = start + (end - start) / 2;

            /** checking if mid element is equal to target element */
            if (arr[mid] == target) {
                return mid;
            }
/**
 checking if mid element is less than target element
 yes: element found on the right side of mid , so we have to move start index
 */
            else if (arr[mid] < target) {
                start = mid + 1;
            }
/**
 checking if mid element id greater than target element
 yes: element found on left side of mid , so we have to move end index
 */
            else {
                end = mid - 1;
            }

        }
        return -1;
    }

    private static int binarySearchReverse(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            /** to avoid overflow of integer value we used this approach */
            int mid = start + (end - start) / 2;

            /** checking if mid element is equal to target element */
            if (arr[mid] == target) {
                return mid;
            }
/**
 checking if mid element is less than target element
 yes: element found on the left side of mid , so we have to move end index
 */
            else if (arr[mid] < target) {
                end = mid - 1;
            }
/**
 checking if mid element id greater than target element
 yes: element found on right side of mid , so we have to move start index
 */
            else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static int binarySearchAgnostic(int[] arr, int start, int end, int target) {

        /** check array order */
        if (arr[start] > arr[end]) {
            /** "decreasing array" */
            return binarySearch(arr, target);
        } else {
            /** "Increasing array" */
            return binarySearchReverse(arr, target);
        }
    }
}
