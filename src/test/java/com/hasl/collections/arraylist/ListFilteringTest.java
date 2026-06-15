package com.hasl.collections.arraylist;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ListFilteringTest {

    @Test
    public void testFilterIntegers() {
        assertThat(ListFiltering.filterIntegers(List.of("a", 1, "b", 2, 3)))
                .containsExactly(1, 2, 3);
        assertThat(ListFiltering.filterIntegers(List.of(1, 2, 3)))
                .containsExactly(1, 2, 3);
        assertThat(ListFiltering.filterIntegers(List.of("a", "b", "c")))
                .isEmpty();

        assertThat(ListFiltering.filterIntegersForEach(List.of("a", 1, "b", 2, 3)))
                .containsExactly(1, 2, 3);
        assertThat(ListFiltering.filterIntegersForEach(List.of(1, 2, 3)))
                .containsExactly(1, 2, 3);
        assertThat(ListFiltering.filterIntegersForEach(List.of("a", "b", "c")))
                .isEmpty();
    }
}