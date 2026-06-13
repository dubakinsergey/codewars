package com.hasl.kyu7;

public class ExesOhs {
    public static boolean getXO(String str) {

        String lower = str.toLowerCase();
        int xCount = 0;
        int oCount = 0;

        for (int i = 0; i < lower.length(); i++) {
            if (lower.charAt(i) == 'x') {
                xCount++;
            }
            if (lower.charAt(i) == 'o') {
                oCount++;
            }
        }
        return xCount == oCount;
    }

    public static boolean getXOBalance(String str) {

        int balance = 0;

        for (char el : str.toLowerCase().toCharArray()) {
            if (el == 'x') balance++;
            if (el == 'o') balance--;
        }
        return balance == 0;
    }
}

// "xo" → true
// "xxOo" → true
// "xxxm" → false