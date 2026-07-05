package com.hasl.streams.practice;

public class VowelCountStream {
    public static long countVowels(String str) {

        String vowels = "AEIOUaeiou";

        return str.chars()
                .filter(el -> vowels.indexOf(el) != -1)
                .count();
    }
}
// "abracadabra" → 5 (a,a,a,a,a)