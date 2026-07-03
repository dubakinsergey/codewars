package com.hasl.streams.aggregation;

import java.util.List;

public class AverageNumbers {
    public static double average(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(el -> el)
                .average()
                .orElse(0.0);
    }
}
// [1, 2, 3, 4] → 2.5