package com.hasl.collections.hashmap;

import org.testng.annotations.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CountWordsTest {

    @Test
    public void testCount() {
        assertThat(CountWords.count("one two three one two one"))
                .isEqualTo(Map.of("one", 3, "two", 2, "three", 1));
        assertThat(CountWords.count("hello hello world"))
                .isEqualTo(Map.of("hello", 2, "world", 1));
        assertThat(CountWords.count("")).isEmpty();
    }
}