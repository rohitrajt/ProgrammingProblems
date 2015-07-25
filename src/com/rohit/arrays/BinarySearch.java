package com.rohit.arrays;

public class BinarySearch {

    public boolean search(int[] array, int key) {

        int high = array.length - 1;

        return binarySearch(array, 0, high, key);
    }

    private boolean binarySearch(int[] input, int low, int high, int key) {
        if (low > high) {
            //Element not found
            return false;
        }

        int mid = (low + high) / 2;

        if (input[mid] == key) {
            return true;
        }

        if (input[mid] > key) {
            return binarySearch(input, low, mid - 1, key);
        }

        if (input[mid] < key) {
            return binarySearch(input, mid + 1, high, key);
        }

        return false;
    }


}
