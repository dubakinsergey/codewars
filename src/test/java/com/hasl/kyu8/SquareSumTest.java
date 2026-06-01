package com.hasl.kyu8;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SquareSumTest {

    @Test
    public void testSquareSum() {
        assertThat(SquareSum.squareSum(new int[]{1, 2, 2})).isEqualTo(9);
        assertThat(SquareSum.squareSum(new int[]{1, 2})).isEqualTo(5);
        assertThat(SquareSum.squareSum(new int[]{5, 3, 4})).isEqualTo(50);
        assertThat(SquareSum.squareSum(new int[]{})).isEqualTo(0);
    }
}