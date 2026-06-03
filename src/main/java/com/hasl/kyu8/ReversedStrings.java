package com.hasl.kyu8;

public class ReversedStrings {
    public static String reverse(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}