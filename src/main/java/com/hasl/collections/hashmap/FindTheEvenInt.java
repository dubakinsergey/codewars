package com.hasl.collections.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheEvenInt {
    public static int findEven(List<Integer> numbers) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer el : numbers) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                return entry.getKey(); // ← возвращаем число, а не частоту
            }
        }
        return 0;
    }
}

// [1, 2, 2, 3, 3, 3, 4, 4, 4, 4] → 2