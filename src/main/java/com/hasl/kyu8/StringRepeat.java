package com.hasl.kyu8;

public class StringRepeat {
    public static String repeatStr(int repeat, String string) {
        return string.repeat(repeat);
    }

    public static String repeatStringBuilder(int repeat, String string) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            result.append(string);
        }
        return result.toString();
    }
}

// 5, "Hello" → "HelloHelloHelloHelloHello"