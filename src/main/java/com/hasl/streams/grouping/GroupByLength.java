package com.hasl.streams.grouping;

import java.util.List;
import java.util.Map;

public class GroupByLength {
    public static Map<Integer, List<String>> groupByLength(List<String> words) {
        // ["a", "ab", "abc", "ab", "abcd"] → {1=[a], 2=[ab, ab], 3=[abc], 4=[abcd]}
        return Map.of();
    }
}