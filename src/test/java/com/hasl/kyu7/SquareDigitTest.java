package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareDigitTest {

    @Test
    public void testSquareDigits() {
        assertThat(SquareDigit.squareDigits(9119)).isEqualTo(811181);
        assertThat(SquareDigit.squareDigits(0)).isZero();
        assertThat(SquareDigit.squareDigits(123)).isEqualTo(149);
        assertThat(SquareDigit.squareDigits(9999)).isEqualTo(81818181);
    }
}