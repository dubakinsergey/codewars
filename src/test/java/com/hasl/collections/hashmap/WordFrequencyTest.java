package com.hasl.collections.hashmap;

import org.testng.annotations.Test;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;

public class WordFrequencyTest {

    @Test
    public void testCount() {
        Map<String, Integer> expected = Map.of("one", 3, "two", 2, "three", 1);
        assertThat(WordFrequency.count("one two three one two one")).isEqualTo(expected);

        assertThat(WordFrequency.count("hello hello world")).isEqualTo(Map.of("hello", 2, "world", 1));
        assertThat(WordFrequency.count("")).isEmpty();
        assertThat(WordFrequency.count("a a a")).isEqualTo(Map.of("a", 3));
    }
}