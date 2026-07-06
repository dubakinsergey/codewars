package com.hasl.kyu6;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidParenthesesTest {

    @Test
    public void testIsValid() {
        assertThat(ValidParentheses.isValid("()")).isTrue();
        assertThat(ValidParentheses.isValid("())")).isFalse();
        assertThat(ValidParentheses.isValid("(()())")).isTrue();
        assertThat(ValidParentheses.isValid("")).isTrue();
        assertThat(ValidParentheses.isValid(")(")).isFalse();
    }
}