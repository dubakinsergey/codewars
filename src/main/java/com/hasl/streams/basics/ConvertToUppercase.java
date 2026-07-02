package com.hasl.streams.basics;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {
    public static List<String> toUppercase(List<String> strings) {
        return strings.stream()
                .map(el -> el.toUpperCase())
                .collect(Collectors.toList());
    }
}
// ["hello", "world"] → ["HELLO", "WORLD"]