package com.hasl.streams.basics;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsByLength {
    public static List<String> filterByLength(List<String> strings, int minLength) {
        return strings.stream()
                .filter(el -> el.length() >= minLength)
                .collect(Collectors.toList());
    }
}
// ["a", "ab", "abc", "abcd"], 3 → ["abc", "abcd"]