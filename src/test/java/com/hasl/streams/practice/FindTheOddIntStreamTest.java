package com.hasl.streams.practice;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FindTheOddIntStreamTest {

    @Test
    public void testFindOdd() {
        assertThat(FindTheOddIntStream.findOdd(List.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 4))).isEqualTo(3);
        assertThat(FindTheOddIntStream.findOdd(List.of(1, 1, 2))).isEqualTo(2);
        assertThat(FindTheOddIntStream.findOdd(List.of(0))).isZero();
    }
}