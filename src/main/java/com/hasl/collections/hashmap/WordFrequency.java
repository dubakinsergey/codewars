package com.hasl.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static Map<String, Integer> count(String sentence) {

        if (sentence == null || sentence.isEmpty()) {
            return new HashMap<>();
        }

        String[] strSpl = sentence.split(" ");
        Map<String, Integer> mapResult = new HashMap<>();

        for (String el : strSpl) {
            mapResult.put(el, mapResult.getOrDefault(el, 0) + 1);
        }
        return mapResult;
    }
}

// "one two three one two one" → {one=3, two=2, three=1}