package com.hasl.streams.basics;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FilterStringsByLengthTest {

    @Test
    public void testFilterByLength() {
        assertThat(FilterStringsByLength.filterByLength(List.of("a", "ab", "abc", "abcd"), 3))
                .containsExactly("abc", "abcd");
        assertThat(FilterStringsByLength.filterByLength(List.of("hello", "hi"), 5))
                .containsExactly("hello");
        assertThat(FilterStringsByLength.filterByLength(List.of(), 1))
                .isEmpty();
    }
}