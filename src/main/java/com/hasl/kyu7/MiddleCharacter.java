package com.hasl.kyu7;

public class MiddleCharacter {
    public static String getMiddle(String word) {

        if (word == null || word.isEmpty()) {
            return "";
        }

        if (word.length() == 1) {
            return String.valueOf(word.charAt(0));
        }

        int length = word.length();

        if (length % 2 == 1) {
            return String.valueOf(word.charAt(length / 2));
        } else {
            return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        }
    }
}
// "test" → "es"
// "middle" → "dd"
// "A" → "A"