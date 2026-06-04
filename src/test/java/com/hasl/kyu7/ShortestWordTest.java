package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShortestWordTest {

    @Test
    public void testFindShort() {
        assertThat(ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps")).isEqualTo(3);
        assertThat(ShortestWord.findShort("turns out random test cases are easier than writing out basic ones")).isEqualTo(3);
        assertThat(ShortestWord.findShort("a")).isEqualTo(1);
    }
}