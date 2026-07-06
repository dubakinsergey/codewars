package com.hasl.kyu6;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StopGninnipSMySdroWTest {

    @Test
    public void testSpinWords() {
        assertThat(StopGninnipSMySdroW.spinWords("Hey fellow warriors")).isEqualTo("Hey wollef sroirraw");
        assertThat(StopGninnipSMySdroW.spinWords("This is a test")).isEqualTo("This is a test");
        assertThat(StopGninnipSMySdroW.spinWords("Welcome")).isEqualTo("emocleW");
    }
}