package com.hasl.kyu8;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsDivisibleTest {

    @Test
    public void testIsDivisible() {
        assertThat(IsDivisible.isDivisible(12, 3, 4)).isTrue();
        assertThat(IsDivisible.isDivisible(8, 3, 4)).isFalse();
        assertThat(IsDivisible.isDivisible(10, 2, 5)).isTrue();
        assertThat(IsDivisible.isDivisible(10, 2, 3)).isFalse();
    }
}