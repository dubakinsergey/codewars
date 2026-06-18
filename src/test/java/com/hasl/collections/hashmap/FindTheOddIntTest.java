package com.hasl.collections.hashmap;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FindTheOddIntTest {

    @Test
    public void testFindOdd() {
        assertThat(FindTheOddInt.findOdd(List.of(1, 1, 2))).isEqualTo(2); // 2 встречается 1 раз → нечётное
        assertThat(FindTheOddInt.findOdd(List.of(0))).isZero();
        assertThat(FindTheOddInt.findOdd(List.of(1, 2, 2, 3, 3, 3, 3))).isEqualTo(1); // только 1 нечётное
    }
}