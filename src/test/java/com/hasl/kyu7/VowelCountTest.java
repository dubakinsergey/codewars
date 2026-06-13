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

        assertThat(VowelCount.getCount("abracadabra")).isEqualTo(5);
        assertThat(VowelCount.getCount("")).isZero();
        assertThat(VowelCount.getCount("bcdfg")).isZero();
        assertThat(VowelCount.getCount("aeiou")).isEqualTo(5);
        assertThat(VowelCount.getCount("AEIOU")).isEqualTo(5);
    }
}