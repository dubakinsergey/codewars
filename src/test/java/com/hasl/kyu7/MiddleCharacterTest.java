package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleCharacterTest {

    @Test
    public void testGetMiddle() {
        assertThat(MiddleCharacter.getMiddle("test")).isEqualTo("es");
        assertThat(MiddleCharacter.getMiddle("testing")).isEqualTo("t");
        assertThat(MiddleCharacter.getMiddle("middle")).isEqualTo("dd");
        assertThat(MiddleCharacter.getMiddle("A")).isEqualTo("A");
        assertThat(MiddleCharacter.getMiddle("")).isEqualTo("");
    }
}