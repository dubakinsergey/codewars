package com.hasl.collections.hashmap;

import org.testng.annotations.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CharacterFrequencyAdvancedTest {

    @Test
    public void testCount() {
        assertThat(CharacterFrequencyAdvanced.count("Hello World"))
                .isEqualTo(Map.of('h', 1, 'e', 1, 'l', 3, 'o', 2, 'w', 1, 'r', 1, 'd', 1));
        assertThat(CharacterFrequencyAdvanced.count("aabbcc"))
                .isEqualTo(Map.of('a', 2, 'b', 2, 'c', 2));
        assertThat(CharacterFrequencyAdvanced.count("")).isEmpty();
    }
}