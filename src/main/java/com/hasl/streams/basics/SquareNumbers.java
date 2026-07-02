package com.hasl.streams.basics;

import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static List<Integer> square(List<Integer> numbers) {
        return numbers.stream()
                .map(el -> el * el)
                .collect(Collectors.toList());
    }
}
// [1, 2, 3] → [1, 4, 9]