package com.hasl.kyu8;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CountSumArrayTest {

    @Test
    public void testCountPositivesSumNegatives() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] expected = {10, -65};
        assertThat(CountSumArray.countPositivesSumNegatives(input)).containsExactly(expected);

        assertThat(CountSumArray.countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}))
                .containsExactly(new int[]{8, -65});

        assertThat(CountSumArray.countPositivesSumNegatives(null)).isEmpty();
        assertThat(CountSumArray.countPositivesSumNegatives(new int[]{})).isEmpty();
    }
}