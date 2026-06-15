package com.hasl.collections.hashset;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UniqueNumbersTest {

    @Test
    public void testCountUnique() {
        assertThat(UniqueNumbers.countUnique(List.of(1, 2, 2, 3, 3, 3))).isEqualTo(3);
        assertThat(UniqueNumbers.countUnique(List.of(1, 1, 1))).isEqualTo(1);
        assertThat(UniqueNumbers.countUnique(List.of())).isZero();
    }
}