package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OddOrEvenTest {

    @Test
    public void testOddOrEven() {
        assertThat(OddOrEven.oddOrEven(new int[]{0})).isEqualTo("even");
        assertThat(OddOrEven.oddOrEven(new int[]{1, 2, 3})).isEqualTo("even");
        assertThat(OddOrEven.oddOrEven(new int[]{1, 2, 4})).isEqualTo("odd");
        assertThat(OddOrEven.oddOrEven(new int[]{})).isEqualTo("even");
        assertThat(OddOrEven.oddOrEven(new int[]{-1, -2, -3})).isEqualTo("even");
    }
}