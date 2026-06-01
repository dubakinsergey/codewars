package com.hasl.kyu8;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SumOfPositiveTest {

    @Test
    public void testSumOfPositive() {
        assertThat(SumOfPositive.sumOfPositive(new int[]{1, 2, 3, 4, 5})).isEqualTo(15);
        assertThat(SumOfPositive.sumOfPositive(new int[]{1, -2, 3, 4, 5})).isEqualTo(13);
        assertThat(SumOfPositive.sumOfPositive(new int[]{-1, -2, -3})).isEqualTo(0);
        assertThat(SumOfPositive.sumOfPositive(new int[]{})).isEqualTo(0);
        assertThat(SumOfPositive.sumOfPositive(null)).isEqualTo(0);
    }
}