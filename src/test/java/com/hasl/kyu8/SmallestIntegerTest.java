package com.hasl.kyu8;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SmallestIntegerTest {

    @Test
    public void testFindSmallestInt() {
        assertThat(SmallestInteger.findSmallestInt(new int[]{34, 15, 88, 2})).isEqualTo(2);
        assertThat(SmallestInteger.findSmallestInt(new int[]{-1, -5, 0, 10})).isEqualTo(-5);
        assertThat(SmallestInteger.findSmallestInt(new int[]{100})).isEqualTo(100);
    }
}