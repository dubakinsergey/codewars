package com.hasl.streams.practice;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayDiffStreamTest {

    @Test
    public void testArrayDiff() {
        assertThat(ArrayDiffStream.arrayDiff(List.of(1, 2, 2, 3), List.of(2)))
                .containsExactly(1, 3);
        assertThat(ArrayDiffStream.arrayDiff(List.of(1, 2, 3), List.of(1, 2)))
                .containsExactly(3);
        assertThat(ArrayDiffStream.arrayDiff(List.of(1, 2, 3), List.of()))
                .containsExactly(1, 2, 3);
        assertThat(ArrayDiffStream.arrayDiff(List.of(), List.of(1, 2)))
                .isEmpty();
    }
}