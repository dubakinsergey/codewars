package com.hasl.collections.hashmap;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DuplicateEncoderTest {

    @Test
    public void testEncode() {
        assertThat(DuplicateEncoder.encode("din")).isEqualTo("(((");
        assertThat(DuplicateEncoder.encode("recede")).isEqualTo("()()()");
        assertThat(DuplicateEncoder.encode("Success")).isEqualTo(")())())");
        assertThat(DuplicateEncoder.encode("(( @")).isEqualTo("))((");
    }
}