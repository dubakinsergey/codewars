package com.hasl.kyu6;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualSidesOfAnArrayTest {

    @Test
    public void testFindEvenIndex() {
        assertThat(EqualSidesOfAnArray.findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1})).isEqualTo(3);
        assertThat(EqualSidesOfAnArray.findEvenIndex(new int[]{1, 100, 50, -51, 1, 1})).isEqualTo(1);
        assertThat(EqualSidesOfAnArray.findEvenIndex(new int[]{20, 10, 30, 10, 10, 15, 35})).isEqualTo(3);
        assertThat(EqualSidesOfAnArray.findEvenIndex(new int[]{1, 2, 3})).isEqualTo(-1);
    }
}