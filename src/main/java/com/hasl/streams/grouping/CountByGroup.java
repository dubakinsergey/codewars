package com.hasl.streams.grouping;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountByGroup {
    public static Map<String, Long> countByCategory(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
// ["cat", "dog", "cat", "bird", "dog", "cat"] → {cat=3, dog=2, bird=1}