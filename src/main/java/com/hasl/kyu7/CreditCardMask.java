package com.hasl.kyu7;

public class CreditCardMask {
    public static String maskify(String str) {

        if (str == null || str.length() <= 4) {
            return str;
        }

        int maskLength = str.length() - 4;
        String hashes = "#".repeat(maskLength);
        String lastFour = str.substring(str.length() - 4);

        return hashes + lastFour;
    }
}

// TODO: "4556364607935616" → "############5616"
// Если длина меньше 4 — вернуть как есть
