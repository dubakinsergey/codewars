package com.hasl.streams.aggregation;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AverageNumbersTest {

    @Test
    public void testAverage() {
        assertThat(AverageNumbers.average(List.of(1, 2, 3, 4))).isEqualTo(2.5);
        assertThat(AverageNumbers.average(List.of())).isZero();
        assertThat(AverageNumbers.average(List.of(10, 20, 30))).isEqualTo(20.0);
    }
}