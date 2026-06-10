package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareTest {

    @Test
    public void testIsSquare() {
        assertThat(Square.isSquare(-1)).isFalse();
        assertThat(Square.isSquare(0)).isTrue();
        assertThat(Square.isSquare(4)).isTrue();
        assertThat(Square.isSquare(25)).isTrue();
        assertThat(Square.isSquare(26)).isFalse();
    }
}