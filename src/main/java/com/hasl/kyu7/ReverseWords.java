package com.hasl.kyu7;

public class ReverseWords {
    public static String reverseWords(String original) {

        StringBuilder resultBuilder = new StringBuilder();
        String[] wordArr = original.split(" ", -1);

        for (int i = 0; i < wordArr.length; i++) {
            String reversedWord = new StringBuilder(wordArr[i]).reverse().toString();
            resultBuilder.append(reversedWord);

            if (i < wordArr.length - 1) {
                resultBuilder.append(" ");
            }
        }
        return resultBuilder.toString();
    }
}

// TODO: "The quick brown fox jumps over the lazy dog."
// → "ehT kciuq nworb xof spmuj revo eht yzal .god"
// Пробелы сохранить