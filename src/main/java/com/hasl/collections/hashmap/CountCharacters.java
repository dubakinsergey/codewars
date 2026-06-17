package com.hasl.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char el : str.toCharArray()) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        return map;
    }
}

// "hello" → {h=1, e=1, l=2, o=1}