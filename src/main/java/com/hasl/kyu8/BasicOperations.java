package com.hasl.kyu8;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {

        int result = switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> 0;
        };
        return result;
    }
}

// "+", 4, 7 → 11
// "-", 15, 18 → -3
// "*", 5, 5 → 25
// "/", 49, 7 → 7