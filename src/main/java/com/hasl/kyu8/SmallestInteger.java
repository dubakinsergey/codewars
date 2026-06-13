package com.hasl.kyu8;

import java.util.Arrays;

public class SmallestInteger {
    public static int findSmallestIntBySort(int[] args) {
        Arrays.sort(args);
        return args[0];
    }

    public static int findSmallestIntByFor(int[] args) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }
}

// [34, 15, 88, 2] → 2