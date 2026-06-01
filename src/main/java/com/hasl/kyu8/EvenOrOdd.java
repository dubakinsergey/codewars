package com.hasl.kyu8;

public class EvenOrOdd {
    public static String evenOrOdd(int number) {
        String result = "";

        if (number % 2 == 0) {
            result = "Even";
        } else result = "Odd";
        return result;
    }
}