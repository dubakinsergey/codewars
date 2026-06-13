package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VowelCountTest {

    @Test
    public void testGetCount() {
        assertThat(VowelCount.getCountByValueOf("abracadabra")).isEqualTo(5);
        assertThat(VowelCount.getCountByValueOf("")).isZero();
        assertThat(VowelCount.getCountByValueOf("bcdfg")).isZero();
        assertThat(VowelCount.getCountByValueOf("aeiou")).isEqualTo(5);
        assertThat(VowelCount.getCountByValueOf("AEIOU")).isEqualTo(5);
    }
}