package com.rohit;

import com.rohit.arrays.BinarySearch;

public class Main {

    public static void main(String[] args) {

//        new Permutation().printAllPermutations("abcd");

//        new Combination().printAllCombinations("wxyz");

        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(new BinarySearch().search(inputArray, 44));
    }
}
