package com.hasl.collections.hashmap;

import org.testng.annotations.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CountCharactersTest {

    @Test
    public void testCount() {
        Map<Character, Integer> expected = Map.of('h', 1, 'e', 1, 'l', 2, 'o', 1);
        assertThat(CountCharacters.count("hello")).isEqualTo(expected);

        assertThat(CountCharacters.count("aabbcc")).isEqualTo(Map.of('a', 2, 'b', 2, 'c', 2));
        assertThat(CountCharacters.count("")).isEmpty();
    }
}