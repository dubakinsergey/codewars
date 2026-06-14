package com.hasl.kyu7;

public class ReverseWordsTwo {
    public static String reverseWordsTwo(String original) {
        String[] words = original.split(" ", -1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String reversedWord = new StringBuilder(words[i]).reverse().toString();
            sb.append(reversedWord);

            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

// "The quick brown fox jumps over the lazy dog."
// → "ehT kciuq nworb xof spmuj revo eht yzal .god"
// пробелы сохранить