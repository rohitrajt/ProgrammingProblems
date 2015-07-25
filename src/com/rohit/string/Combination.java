package com.rohit.string;

public class Combination {

    public void printAllCombinations(String input) {

        int length = input.length();

        combine(input, new StringBuffer(), length, 0, 0);
    }

    private void combine(String input, StringBuffer output, int lenght, int recursLength, int start) {
        for (int i = start; i < lenght; i++) {
            output.append(input.charAt(i));

            System.out.println(output);

            if (i < lenght) {
                combine(input, output, lenght, recursLength + 1, i + 1);
            }

            output.setLength(output.length() - 1);
        }
    }

}
