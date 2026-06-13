package com.hasl.kyu8;

public class MonkeyCounter {
    public static int[] monkeyCount(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}

// 5 → [1, 2, 3, 4, 5]