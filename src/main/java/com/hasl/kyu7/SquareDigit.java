package com.hasl.kyu7;

public class SquareDigit {
    public static int squareDigits(int n) {
        String numberStr = String.valueOf(n);
        char[] arrNum = numberStr.toCharArray();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arrNum.length; i++) {
            int digit = Character.getNumericValue(arrNum[i]);
            int square = digit * digit;
            result.append(square);
        }
        return Integer.parseInt(result.toString());
    }
}

// TODO: 9119 → 811181 (9²=81, 1²=1, 1²=1, 9²=81 → 811181)