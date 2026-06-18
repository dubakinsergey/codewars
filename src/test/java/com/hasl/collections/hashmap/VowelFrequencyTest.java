package com.hasl.collections.hashmap;

import org.testng.annotations.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class VowelFrequencyTest {

    @Test
    public void testCount() {
        assertThat(VowelFrequency.count("Hello World")).isEqualTo(Map.of('e', 1, 'o', 2));

        assertThat(VowelFrequency.count("A quick brown fox jumps over the lazy dog"))
                .isEqualTo(Map.of('a', 2, 'e', 2, 'i', 1, 'o', 4, 'u', 2));

        assertThat(VowelFrequency.count("")).isEmpty();
        assertThat(VowelFrequency.count("bcdfg")).isEmpty();
    }
}