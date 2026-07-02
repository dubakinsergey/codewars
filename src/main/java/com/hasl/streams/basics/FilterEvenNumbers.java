package com.hasl.streams.basics;

import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static List<Integer> filterEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(el -> el % 2 == 0)
                .collect(Collectors.toList());
    }
}
// [1, 2, 3, 4, 5, 6] → [2, 4, 6]