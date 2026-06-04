package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringEndsWithTest {

    @Test
    public void testSolution() {
        assertThat(StringEndsWith.solution("abc", "bc")).isTrue();
        assertThat(StringEndsWith.solution("abc", "d")).isFalse();
        assertThat(StringEndsWith.solution("", "")).isTrue();
        assertThat(StringEndsWith.solution("java", "va")).isTrue();
        assertThat(StringEndsWith.solution("Hello", "hello")).isFalse();
    }
}