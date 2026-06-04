package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JadenCasingTest {

    @Test
    public void testToJadenCase() {
        assertThat(JadenCasing.toJadenCase("how can mirrors be real"))
                .isEqualTo("How Can Mirrors Be Real");
        assertThat(JadenCasing.toJadenCase("hello world"))
                .isEqualTo("Hello World");
        assertThat(JadenCasing.toJadenCase(null)).isNull();
        assertThat(JadenCasing.toJadenCase("")).isNull();
        assertThat(JadenCasing.toJadenCase("a")).isEqualTo("A");
    }
}