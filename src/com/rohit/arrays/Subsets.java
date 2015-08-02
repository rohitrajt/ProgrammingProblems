package com.rohit.arrays;

/**
 * NOte: Similar to Combinations
 */
public class Subsets {

    public static void subsetRecursive(int[] arr) {
        int length = arr.length;

        subsets(arr, new int[length], length, 0, 0);
    }

    private static void subsets(int[] arr, int[] temp, int n, int recursLength, int start) {
        for (int i = start; i < n; i++) {
            temp[recursLength] = arr[i];
            System.out.println();
            System.out.print("{ ");
            for (int j = 0; j <= recursLength; j++) {
                System.out.print(temp[j]);
            }
            System.out.print(" }");

            if (i < n - 1) {
                subsets(arr, temp, n, recursLength + 1, i + 1);
            }
        }
    }
}
