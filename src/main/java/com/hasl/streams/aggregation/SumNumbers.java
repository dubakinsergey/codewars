package com.hasl.streams.aggregation;

import java.util.List;

public class SumNumbers {
    public static int sum(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(el -> el)
                .sum();
    }
}

// [1, 2, 3, 4] → 10