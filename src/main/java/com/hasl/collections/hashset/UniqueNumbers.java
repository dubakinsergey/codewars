package com.hasl.collections.hashset;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumbers {
    public static int countUnique(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.size(); i++) {
            Integer el = numbers.get(i);
            set.add(el);
        }
        return set.size();
    }
}

// [1, 2, 2, 3, 3, 3] → 3