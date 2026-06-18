package com.hasl.streams.practice;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VowelCountStreamTest {

    @Test
    public void testCountVowels() {
        assertThat(VowelCountStream.countVowels("abracadabra")).isEqualTo(5);
        assertThat(VowelCountStream.countVowels("")).isZero();
        assertThat(VowelCountStream.countVowels("bcdfg")).isZero();
        assertThat(VowelCountStream.countVowels("aeiou")).isEqualTo(5);
        assertThat(VowelCountStream.countVowels("AEIOU")).isEqualTo(5);
    }
}