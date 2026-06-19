package com.hasl.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyAdvanced {
    public static Map<Character, Integer> count(String str) {

        if (str == null || str.isEmpty()) {
            return new HashMap<>();
        }

        char[] charsLower = str.toLowerCase().toCharArray();
        Map<Character, Integer> mapResult = new HashMap<>();

        for (char el : charsLower) {
            if (el != ' ')
                mapResult.put(el, mapResult.getOrDefault(el, 0) + 1);
        }

        return mapResult;
    }
}

// "Hello World" → {h=1, e=1, l=3, o=2, w=1, r=1, d=1}