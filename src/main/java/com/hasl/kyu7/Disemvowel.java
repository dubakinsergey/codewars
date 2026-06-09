package com.hasl.kyu7;

public class Disemvowel {
    public static String removeVowelRegular(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static String removeVowelManual(String str) {
        String vowels = "aeiouAEIOU";
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            char s = chars[i];
            if (vowels.indexOf(s) == -1)
                result.append(s);
        }
        return result.toString();
    }
}

// TODO: удалить все гласные (a, e, i, o, u) в любом регистре
// "This website is for losers LOL!" → "Ths wbst s fr lsrs LL!"