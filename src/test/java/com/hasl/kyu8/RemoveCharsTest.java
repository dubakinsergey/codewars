package com.hasl.kyu8;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveCharsTest {

    @Test
    public void testRemove() {
        assertThat(RemoveChars.remove("eloquent")).isEqualTo("loquen");
        assertThat(RemoveChars.remove("country")).isEqualTo("ountr");
        assertThat(RemoveChars.remove("a")).isEmpty();
        assertThat(RemoveChars.remove("ab")).isEmpty();
    }
}