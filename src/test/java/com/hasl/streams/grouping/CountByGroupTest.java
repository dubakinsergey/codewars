package com.hasl.streams.grouping;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CountByGroupTest {

    @Test
    public void testCountByCategory() {
        Map<String, Long> expected = Map.of("cat", 3L, "dog", 2L, "bird", 1L);
        assertThat(CountByGroup.countByCategory(List.of("cat", "dog", "cat", "bird", "dog", "cat")))
                .isEqualTo(expected);
        assertThat(CountByGroup.countByCategory(List.of())).isEmpty();
    }
}