package com.hasl.streams.aggregation;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MinMaxNumbersTest {

    @Test
    public void testMin() {
        assertThat(MinMaxNumbers.min(List.of(3, 1, 4, 1, 5))).isEqualTo(1);
        assertThat(MinMaxNumbers.min(List.of(5))).isEqualTo(5);
    }

    @Test
    public void testMax() {
        assertThat(MinMaxNumbers.max(List.of(3, 1, 4, 1, 5))).isEqualTo(5);
        assertThat(MinMaxNumbers.max(List.of(5))).isEqualTo(5);
    }
}