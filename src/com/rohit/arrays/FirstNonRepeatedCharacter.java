package com.rohit.arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public Character find(String input) {

        Map<Character, Integer> map = new HashMap<>();

        int length = input.length();

        for (int i = 0; i < length; i++) {
            if (map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            } else {
                map.put(input.charAt(i), 1);
            }
        }

        for (int i = 0; i < length; i++) {
            if (map.get(input.charAt(i)) == 1) {
                return input.charAt(i);
            }
        }
        return null;
    }
}
