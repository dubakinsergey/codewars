package com.hasl.kyu8;

public class RemoveChars {
    public static String remove(String str) {
        if (str == null || str.length() <= 2) {
            return "";
        } else
            return str.substring(1, str.length() - 1);
    }
}

// "eloquent" → "loquen"
// "country" → "ountr"