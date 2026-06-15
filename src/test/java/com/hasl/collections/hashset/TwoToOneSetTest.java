package com.hasl.collections.hashset;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoToOneSetTest {

    @Test
    public void testLongest() {
        assertThat(TwoToOneSet.longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"))
                .isEqualTo("abcdefklmopqwxy");
        assertThat(TwoToOneSet.longest("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"))
                .isEqualTo("abcdefghijklmnopqrstuvwxyz");
        assertThat(TwoToOneSet.longest("", "abc")).isEqualTo("abc");
    }
}