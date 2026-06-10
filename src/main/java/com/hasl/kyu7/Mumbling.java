package com.hasl.kyu7;

public class Mumbling {
    public static String accum(String s) {
        s = s.toLowerCase();
        char[] simbols = s.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < simbols.length; i++) {
            char c = simbols[i];

            // 1. Заглавная буква
            result.append(Character.toUpperCase(c));

            // 2. Маленькие буквы (повторяем c i раз)
            for (int j = 0; j < i; j++) {
                result.append(c);
            }

            // 3. Дефис между блоками
            if (i < simbols.length - 1) {
                result.append("-");
            }
        }
        return result.toString();
    }
}

// TODO: "abcd" → "A-Bb-Ccc-Dddd"