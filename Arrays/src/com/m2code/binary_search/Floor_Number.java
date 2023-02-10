package com.m2code.binary_search;

public class Floor_Number {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 10, 14, 25, 56};
        /**           0  1  2  3  4    5   6  */
        int target = 55;
        int floor = floor(arr, target);
        System.out.println(arr[floor]);
    }

    private static int floor(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

//         mid=3-10 target=5 start=0 end=6
//         end=2 start=0 mid=1-4 target=5
//         start=2 end=2 mid=2-8 target=5
//         start=2 end=1 => result end=1
//

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
        return end;
    }
}
