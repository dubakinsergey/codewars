package com.hasl.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class VowelFrequency {
    public static Map<Character, Integer> count(String str) {

        String vowels = "aeiou";
        String lower = str.toLowerCase();
        Map<Character, Integer> mapResult = new HashMap<>();

        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (vowels.indexOf(c) != -1) {
                mapResult.put(c, mapResult.getOrDefault(c, 0) + 1);
            }
        }
        return mapResult;
    }
}

// "Hello World" → {e=1, o=2}