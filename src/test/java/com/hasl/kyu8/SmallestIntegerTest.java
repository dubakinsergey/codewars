package com.hasl.kyu8;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SmallestIntegerTest {

    @Test
    public void testFindSmallestInt() {
        assertThat(SmallestInteger.findSmallestIntBySort(new int[]{34, 15, 88, 2})).isEqualTo(2);
        assertThat(SmallestInteger.findSmallestIntBySort(new int[]{-1, -5, 0, 10})).isEqualTo(-5);
        assertThat(SmallestInteger.findSmallestIntBySort(new int[]{100})).isEqualTo(100);
        System.out.println("-------------------");
        assertThat(SmallestInteger.findSmallestIntByFor(new int[]{34, 15, 88, 2})).isEqualTo(2);
        assertThat(SmallestInteger.findSmallestIntByFor(new int[]{-1, -5, 0, 10})).isEqualTo(-5);
        assertThat(SmallestInteger.findSmallestIntByFor(new int[]{100})).isEqualTo(100);
    }
}