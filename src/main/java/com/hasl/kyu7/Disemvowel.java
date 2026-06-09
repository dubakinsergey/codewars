package com.hasl.kyu7;

public class Disemvowel {
    public static String removeVowelRegular(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}

// TODO: удалить все гласные (a, e, i, o, u) в любом регистре
// "This website is for losers LOL!" → "Ths wbst s fr lsrs LL!"