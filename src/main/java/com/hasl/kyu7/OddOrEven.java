package com.hasl.kyu7;

public class OddOrEven {
    public static String oddOrEven(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (sum % 2 == 0) ? "even" : "odd";
    }
}

// TODO: [0] → "even"
// [1, 2, 3] → "even" (1+2+3=6)
// [1, 2, 4] → "odd" (1+2+4=7)