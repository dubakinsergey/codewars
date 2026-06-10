package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoToOneTest {

    @Test
    public void testLongest() {
        assertThat(TwoToOne.longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"))
                .isEqualTo("abcdefklmopqwxy");
        assertThat(TwoToOne.longest("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"))
                .isEqualTo("abcdefghijklmnopqrstuvwxyz");
        assertThat(TwoToOne.longest("", "abc")).isEqualTo("abc");
        assertThat(TwoToOne.longest("abc", "")).isEqualTo("abc");
    }
}