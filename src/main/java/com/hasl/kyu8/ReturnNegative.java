package com.hasl.kyu8;

public class ReturnNegative {
    public static int makeNegative(int x) {
        int result = 0;

        if (x < 0) {
            result = x * 1;
        }

        if (x == 0) {
            result = 0;
        }
        if (x > 0) {
            result = x * (-1);
        }
        return result;
    }
}
// TODO: вернуть отрицательное число. Если x уже отрицательный или 0 — вернуть как есть