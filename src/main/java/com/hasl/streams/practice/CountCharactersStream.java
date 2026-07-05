package com.hasl.streams.practice;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharactersStream {
    public static Map<Character, Long> countCharacters(String str) {

        return str.chars()
                .mapToObj(el -> (char) el)
                .collect(Collectors.groupingBy(el -> el, Collectors.counting()));
    }
}
// "hello" → {h=1, e=1, l=2, o=1}