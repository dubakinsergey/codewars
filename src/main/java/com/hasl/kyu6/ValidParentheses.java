package com.hasl.kyu6;

public class ValidParentheses {
    public static boolean isValid(String parentheses) {

        int balance = 0;

        for (int i = 0; i < parentheses.length(); i++) {
            char c = parentheses.charAt(i);

            if (c == '(') {
                balance++;
            }
            if (c == ')') {
                balance--;
            }

            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }
}

// "()" → true
// "())" → false
// "(()())" → true