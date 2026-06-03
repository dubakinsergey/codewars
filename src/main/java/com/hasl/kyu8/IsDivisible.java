package com.hasl.kyu8;

public class IsDivisible {
    public static boolean isDivisible(int n, int x, int y) {
        return n % x == 0 && n % y == 0;
    }
}

// TODO: вернуть true если n делится на x И на y без остатка