package com.hasl.kyu8;

public class ReversedStrings {
    public static String reverseStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static String reverse(String str) {
        char[] arrChars = str.toCharArray();
        String result = "";

        for (int i = arrChars.length - 1; i >= 0; i--) {
            result = result + arrChars[i];
        }
        return result;
    }
}