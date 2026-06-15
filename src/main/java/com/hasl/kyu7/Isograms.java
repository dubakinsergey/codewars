package com.hasl.kyu7;

import java.util.HashSet;
import java.util.Set;

public class Isograms {
    public static boolean isIsogram(String str) {
        String lower = str.toLowerCase();
        Set<Character> set = new HashSet<>();

        for (char el : lower.toCharArray()) {
            set.add(el);
        }
        return set.size() == lower.length();
    }
}

// "Dermatoglyphics" → true
// "aba" → false
// "moOse" → false (регистр не важен)