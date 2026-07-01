package com.hasl.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    public static String encode(String word) {

        Map<Character, Integer> freq = new HashMap<>();
        String lower = word.toLowerCase();

        // 1. Подсчёт частоты
        for (char el : lower.toCharArray()) {
            freq.put(el, freq.getOrDefault(el, 0) + 1);
        }

        // 2. Сборка результата
        StringBuilder sb = new StringBuilder();

        for (char el : lower.toCharArray()) {
            if (freq.get(el) == 1) {
                sb.append('(');
            } else sb.append(')');
        }
        return sb.toString();
    }
}
// "din" → "((("
// "recede" → "()()()"
// "Success" → ")())())" (регистр не важен)