package com.hasl.streams.basics;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FilterAndMapTest {

    @Test
    public void testFilterAndSquare() {
        assertThat(FilterAndMap.filterAndSquare(List.of(1, 2, 3, 6, 7, 8)))
                .containsExactly(36, 49, 64);
        assertThat(FilterAndMap.filterAndSquare(List.of(1, 2, 3))).isEmpty();
        assertThat(FilterAndMap.filterAndSquare(List.of())).isEmpty();
    }
}