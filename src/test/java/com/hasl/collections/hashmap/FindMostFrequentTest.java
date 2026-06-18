package com.hasl.collections.hashmap;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FindMostFrequentTest {

    @Test
    public void testFindMostFrequent() {
        assertThat(FindMostFrequent.findMostFrequent(List.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)))
                .isEqualTo(4);
        assertThat(FindMostFrequent.findMostFrequent(List.of(1, 1, 2, 2, 2)))
                .isEqualTo(2);
        assertThat(FindMostFrequent.findMostFrequent(List.of(5)))
                .isEqualTo(5);
    }
}