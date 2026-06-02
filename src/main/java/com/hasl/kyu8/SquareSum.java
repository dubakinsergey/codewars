package com.hasl.kyu8;

public class SquareSum {
    public static int squareSum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + (numbers[i] * numbers[i]);
        }
        return sum;
    }
}

// TODO: вернуть сумму квадратов всех элементов массива