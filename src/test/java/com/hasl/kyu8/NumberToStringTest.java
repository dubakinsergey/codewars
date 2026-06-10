package com.hasl.kyu8;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberToStringTest {

    @Test
    public void testNumberToString() {
        assertThat(NumberToString.numberToString(123)).isEqualTo("123");
        assertThat(NumberToString.numberToString(-123)).isEqualTo("-123");
        assertThat(NumberToString.numberToString(0)).isEqualTo("0");
    }
}