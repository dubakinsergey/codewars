package com.hasl.kyu8;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringRepeatTest {

    @Test
    public void testRepeatStr() {
        assertThat(StringRepeat.repeatStr(5, "Hello")).isEqualTo("HelloHelloHelloHelloHello");
        assertThat(StringRepeat.repeatStr(3, "*")).isEqualTo("***");
        assertThat(StringRepeat.repeatStr(0, "abc")).isEmpty();
        assertThat(StringRepeat.repeatStringBuilder(5, "Hello")).isEqualTo("HelloHelloHelloHelloHello");
        assertThat(StringRepeat.repeatStringBuilder(3, "*")).isEqualTo("***");
        assertThat(StringRepeat.repeatStringBuilder(0, "abc")).isEmpty();
    }
}