package com.hasl.streams.practice;

import org.testng.annotations.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CountCharactersStreamTest {

    @Test
    public void testCountCharacters() {
        Map<Character, Long> expected = Map.of('h', 1L, 'e', 1L, 'l', 2L, 'o', 1L);
        assertThat(CountCharactersStream.countCharacters("hello")).isEqualTo(expected);

        assertThat(CountCharactersStream.countCharacters("aabbcc")).isEqualTo(Map.of('a', 2L, 'b', 2L, 'c', 2L));
        assertThat(CountCharactersStream.countCharacters("")).isEmpty();
    }
}