package com.hasl.streams.practice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheOddIntStream {
    public static int findOdd(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() % 2 == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(0);
    }
}

// [1, 2, 2, 3, 3, 3, 4, 4, 4, 4] → 3