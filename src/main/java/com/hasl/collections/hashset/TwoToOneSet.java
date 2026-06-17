package com.hasl.collections.hashset;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class TwoToOneSet {
    public static String longest(String s1, String s2) {

        Set<String> set = new LinkedHashSet<>();

        char[] together = (s1 + s2).toCharArray();

        Arrays.sort(together);

        for (char c : together) {
            set.add(String.valueOf(c));
        }

        return String.join("", set);
    }
}

// "xyaabbbccccdefww", "xxxxyyyyabklmopq" → "abcdefklmopqwxy"
