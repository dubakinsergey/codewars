package com.hasl.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static Map<Character, Integer> count(String str) {

        Map<Character, Integer> mapResult = new HashMap<>();

        for (char c : str.toCharArray()) {
            mapResult.put(c, mapResult.getOrDefault(c, 0) + 1);
        }
        return mapResult;
    }
}

// "banana" → {b=1, a=3, n=2}