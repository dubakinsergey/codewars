package com.hasl.kyu7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        char[] together = (s1 + s2).toCharArray();
        Set<Character> set = new HashSet<>();

        Arrays.sort(together);

        for (char el : together) {
            set.add(el);
        }

        StringBuilder sb = new StringBuilder();

        for (char el : set) {
            sb.append(el);
        }
        return sb.toString();
    }
}

// "xyaabbbccccdefww", "xxxxyyyyabklmopq" → "abcdefklmopqwxy"
