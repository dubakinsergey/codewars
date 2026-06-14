package com.hasl.kyu7;

public class Printer {
    public static String printerError(String s) {
        int errors = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < 'a' || c > 'm') { // если буква не от a до m
                errors++;
            }
        }
        return errors + "/" + s.length();
    }
}

// "aaabbbbhaijjjm" → "0/14"
// "aaaxbbbbyyhwawiwjjjwwm" → "8/22"
// ошибка — буквы не от a до m
