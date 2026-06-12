package com.hasl.kyu8;

import java.util.Arrays;

public class SmallestInteger {
    public static int findSmallestIntBySort(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}

// [34, 15, 88, 2] → 2