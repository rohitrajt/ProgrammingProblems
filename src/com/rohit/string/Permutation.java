package com.rohit.string;

public class Permutation {

    public void printAllPermutations(String input) {
        if (input == null || input.isEmpty()) {
            throw new RuntimeException("Input String for permutation cannot be null or empty");
        }

        int length = input.length();

        boolean[] used = new boolean[length];

        for (int i = 0; i < length; i++) {
            used[i] = false;
        }

        permute(input, new StringBuffer(), used, length, 0);

    }

    private void permute(String input, StringBuffer output, boolean[] used, int lenght, int recursLength) {
        if (lenght == recursLength) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < lenght; i++) {
            if (used[i])
                continue;

            used[i] = true;

            output.append(input.charAt(i));

            permute(input, output, used, lenght, recursLength + 1);

            used[i] = false;

            output.setLength(output.length() - 1);
        }
    }

}
