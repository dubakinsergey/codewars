package com.hasl.streams.aggregation;

import java.util.List;

public class MinMaxNumbers {
    public static int min(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(el -> el)
                .min()
                .orElse(0);
    }
    // [3, 1, 4, 1, 5] → 1

    public static int max(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(el -> el)
                .max()
                .orElse(0);
    }
    // [3, 1, 4, 1, 5] → 5
}