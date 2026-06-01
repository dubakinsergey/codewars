package com.hasl.kyu8;

public class SumOfPositive {
    public static int sumOfPositive(int[] arr) {
        if (arr == null) {
            return 0;
        }

        int sum = 0;

        for (int el : arr) {
            if (el > 0) {
                sum = sum + el;
            }
        }
        return sum;
    }
}

// TODO: вернуть сумму всех положительных чисел. Если массив пустой или null — вернуть 0