package com.hasl.kyu7;

public class OpenOrSenior {
    public static String[] openOrSenior(int[][] data) {
        String[] result = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            // Получи возраст и гандикап
            int age = data[i][0];
            int handicap = data[i][1];

            // Проверь условие Senior
            if (age >= 55 && handicap > 7) {
                result[i] = "Senior";
            } else result[i] = "Open";
        }
        return result;
    }
}

// [[45, 12], [55,21], [19, -2], [104, 20]] → ["Open", "Senior", "Open", "Senior"]
// Senior: возраст >= 55 и гандикап > 7