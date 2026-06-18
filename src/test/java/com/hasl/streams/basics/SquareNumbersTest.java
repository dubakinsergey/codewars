package com.hasl.streams.basics;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareNumbersTest {

    @Test
    public void testSquare() {
        assertThat(SquareNumbers.square(List.of(1, 2, 3))).containsExactly(1, 4, 9);
        assertThat(SquareNumbers.square(List.of(0, -2, 3))).containsExactly(0, 4, 9);
        assertThat(SquareNumbers.square(List.of())).isEmpty();
    }
}