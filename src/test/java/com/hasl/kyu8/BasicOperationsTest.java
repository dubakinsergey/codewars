package com.hasl.kyu8;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicOperationsTest {

    @Test
    public void testBasicMath() {
        assertThat(BasicOperations.basicMath("+", 4, 7)).isEqualTo(11);
        assertThat(BasicOperations.basicMath("-", 15, 18)).isEqualTo(-3);
        assertThat(BasicOperations.basicMath("*", 5, 5)).isEqualTo(25);
        assertThat(BasicOperations.basicMath("/", 49, 7)).isEqualTo(7);
    }
}