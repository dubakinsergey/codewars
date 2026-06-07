package com.hasl.kyu7;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(int num) {
        String strNum = String.valueOf(num);
        char[] numArr = strNum.toCharArray();
        Arrays.sort(numArr);

        String sortAsc = new String(numArr);
        String sortDesc = new StringBuilder(sortAsc).reverse().toString();

        return Integer.parseInt(sortDesc);
    }
}

// TODO: 42145 → 54421
// Число положительное, не длиннее 10 цифр