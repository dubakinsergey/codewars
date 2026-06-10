package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OpenOrSeniorTest {

    @Test
    public void testOpenOrSenior() {
        int[][] data1 = {{45, 12}, {55, 21}, {19, -2}, {104, 20}};
        String[] expected1 = {"Open", "Senior", "Open", "Senior"};
        assertThat(OpenOrSenior.openOrSenior(data1)).containsExactly(expected1);

        int[][] data2 = {{16, 23}, {73, 1}, {56, 20}, {1, -1}};
        String[] expected2 = {"Open", "Open", "Senior", "Open"};
        assertThat(OpenOrSenior.openOrSenior(data2)).containsExactly(expected2);
    }
}