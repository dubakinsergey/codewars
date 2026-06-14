package com.hasl.kyu7;

public class Square {
    public static boolean isSquare(int n) {
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }
}

// -1 → false
// 0 → true
// 4 → true
// 25 → true
// 26 → false