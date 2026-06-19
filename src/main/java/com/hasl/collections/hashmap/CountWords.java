package com.hasl.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static Map<String, Integer> count(String sentence) {

        if (sentence == null || sentence.isEmpty()) {
            return new HashMap<>();
        }

        String[] words = sentence.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String el : words) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        return map;
    }
}

// "one two three one two one" → {one=3, two=2, three=1}