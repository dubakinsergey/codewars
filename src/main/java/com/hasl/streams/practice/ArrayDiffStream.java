package com.hasl.streams.practice;

import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiffStream {
    public static List<Integer> arrayDiff(List<Integer> a, List<Integer> b) {
        return a.stream()
                .filter(el -> !b.contains(el))
                .collect(Collectors.toList());
    }
}

// [1, 2, 2, 3], [2] → [1, 3]