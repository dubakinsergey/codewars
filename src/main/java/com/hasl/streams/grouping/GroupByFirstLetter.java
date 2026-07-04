package com.hasl.streams.grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {
    public static Map<Character, List<String>> groupByFirstLetter(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(el -> el.charAt(0)));
    }
}
// ["apple", "banana", "apricot", "blueberry"] → {a=[apple, apricot], b=[banana, blueberry]}