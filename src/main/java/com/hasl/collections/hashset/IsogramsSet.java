package com.hasl.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class IsogramsSet {
    public static boolean isIsogram(String str) {

        String lowerCase = str.toLowerCase();
        Set<Character> set = new HashSet<>();

        for (char el : lowerCase.toCharArray()) {
            set.add(el);
        }

        return set.size() == str.length();
    }
}

// "Dermatoglyphics" → true
// "aba" → false
// "moOse" → false (регистр не важен)