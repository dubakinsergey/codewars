package com.hasl.streams.aggregation;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SumNumbersTest {

    @Test
    public void testSum() {
        assertThat(SumNumbers.sum(List.of(1, 2, 3, 4))).isEqualTo(10);
        assertThat(SumNumbers.sum(List.of())).isZero();
        assertThat(SumNumbers.sum(List.of(5))).isEqualTo(5);
    }
}