package com.hasl.kyu8;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AverageTest {

    @Test
    public void testFindAverage() {
        assertThat(Average.findAverage(new int[]{1, 2, 3})).isEqualTo(2.0);
        assertThat(Average.findAverage(new int[]{10, 20, 30})).isEqualTo(20.0);
        assertThat(Average.findAverage(new int[]{})).isZero();
    }
}