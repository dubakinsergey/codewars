package com.hasl.kyu8;

public class CountSumArray {
    public static int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length == 0) {
            return new int[]{};
        }

        int numberPositive = 0;
        int sumNegative = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                sumNegative = sumNegative + input[i];
            }
            if (input[i] > 0) {
                numberPositive = numberPositive + 1;
            }
        }
        return new int[]{numberPositive, sumNegative};
    }
}

// TODO: вернуть массив [количество положительных, сумма отрицательных]
// Если input null или пустой — вернуть пустой массив