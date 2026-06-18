package com.hasl.streams.basics;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FilterEvenNumbersTest {

    @Test
    public void testFilterEven() {
        assertThat(FilterEvenNumbers.filterEven(List.of(1, 2, 3, 4, 5, 6)))
                .containsExactly(2, 4, 6);
        assertThat(FilterEvenNumbers.filterEven(List.of(1, 3, 5)))
                .isEmpty();
        assertThat(FilterEvenNumbers.filterEven(List.of()))
                .isEmpty();
    }
}