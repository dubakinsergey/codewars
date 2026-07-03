package com.hasl.streams.basics;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {
    public static List<Integer> filterAndSquare(List<Integer> numbers) {
        return numbers.stream()
                .filter(el -> el > 5)
                .map(el -> el * el)
                .collect(Collectors.toList());
    }
}
// [1, 2, 3, 6, 7, 8] → отфильтровать > 5 → [6, 7, 8] → возвести в квадрат → [36, 49, 64]