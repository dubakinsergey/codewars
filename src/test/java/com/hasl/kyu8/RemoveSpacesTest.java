package com.hasl.kyu8;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveSpacesTest {

    @Test
    public void testNoSpace() {
        assertThat(RemoveSpaces.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"))
                .isEqualTo("8j8mBliB8gimjB8B8jlB");
        assertThat(RemoveSpaces.noSpace("hello world")).isEqualTo("helloworld");
        assertThat(RemoveSpaces.noSpace("")).isEmpty();
    }
}