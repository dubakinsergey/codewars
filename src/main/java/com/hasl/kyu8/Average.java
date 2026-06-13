package com.hasl.kyu8;

public class Average {
    public static double findAverage(int[] array) {
        double sum = 0;

        if (array == null || array.length == 0) {
            return 0.0;
        }

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }
}

// [1, 2, 3] → 2.0
// [] → 0.0