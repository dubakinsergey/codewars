package com.hasl.kyu8;

public class MapDouble {
    public static int[] map(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[]{};
        }

        int[] arrBuffer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrBuffer[i] = arr[i] * 2;
        }
        return arrBuffer;
    }
}

// TODO: вернуть массив, где каждый элемент умножен на 2