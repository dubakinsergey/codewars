package com.hasl.kyu8;

public class Summation {
    public static int summation(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

// TODO: вернуть сумму чисел от 1 до n (n > 0)