package com.hasl.streams.basics;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertToUppercaseTest {

    @Test
    public void testToUppercase() {
        assertThat(ConvertToUppercase.toUppercase(List.of("hello", "world")))
                .containsExactly("HELLO", "WORLD");
        assertThat(ConvertToUppercase.toUppercase(List.of("a", "b"))).containsExactly("A", "B");
        assertThat(ConvertToUppercase.toUppercase(List.of())).isEmpty();
    }
}