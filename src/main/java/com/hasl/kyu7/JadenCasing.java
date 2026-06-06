package com.hasl.kyu7;

public class JadenCasing {
    public static String toJadenCase(String phrase) {

        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        String[] word = phrase.split(" ");
        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < word.length; i++) {
            char first = word[i].charAt(0);
            char upper = Character.toUpperCase(first);
            String partString = word[i].substring(1);
            String transformedWord = upper + partString.toLowerCase();
            stringBuilder.append(transformedWord);

            if (i < word.length - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}

// TODO: "how can mirrors be real" → "How Can Mirrors Be Real"
// Если null или пустая строка — вернуть null