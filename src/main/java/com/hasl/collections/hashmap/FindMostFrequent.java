package com.hasl.collections.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMostFrequent {
    public static int findMostFrequent(List<Integer> numbers) {


        Map<Integer, Integer> map = new HashMap<>();

        for (int el : numbers) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        int maxCount = 0;
        int mostFrequent = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent;
    }
}

// [1, 2, 2, 3, 3, 3, 4, 4, 4, 4] → 4