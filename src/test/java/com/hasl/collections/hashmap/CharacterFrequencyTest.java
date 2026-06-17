package com.hasl.collections.hashmap;

import org.testng.annotations.Test;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;

public class CharacterFrequencyTest {

    @Test
    public void testCount() {
        Map<Character, Integer> expected = Map.of('b', 1, 'a', 3, 'n', 2);
        assertThat(CharacterFrequency.count("banana")).isEqualTo(expected);

        assertThat(CharacterFrequency.count("aabbcc")).isEqualTo(Map.of('a', 2, 'b', 2, 'c', 2));
        assertThat(CharacterFrequency.count("")).isEmpty();
    }
}