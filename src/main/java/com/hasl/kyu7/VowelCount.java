package com.hasl.kyu7;

public class VowelCount {
    public static int getCountByValueOf(String str) {

        char[] chars = str.toCharArray();
        String vowels = "AEIOUaeiou";
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (vowels.contains(String.valueOf(chars[i])))
                count++;
        }
        return count;
    }
}

// "abracadabra" → 5 (a,a,a,a,a)