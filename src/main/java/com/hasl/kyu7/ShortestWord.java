package com.hasl.kyu7;

public class ShortestWord {
    public static int findShort(String s) {
        int minLength = Integer.MAX_VALUE;
        String[] charsWord = s.split(" ");

        for (int i = 0; i < charsWord.length; i++) {
            if (charsWord[i].length() < minLength) {
                minLength = charsWord[i].length();
            }
        }
        return minLength;
    }
}

// TODO: "bitcoin take over the world maybe who knows perhaps" → 3 (слово "who" или "the")