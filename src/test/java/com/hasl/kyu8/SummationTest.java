package com.hasl.kyu8;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SummationTest {

    @Test
    public void testSummation() {
        assertThat(Summation.summation(1)).isEqualTo(1);
        assertThat(Summation.summation(2)).isEqualTo(3);
        assertThat(Summation.summation(8)).isEqualTo(36);
        assertThat(Summation.summation(10)).isEqualTo(55);
    }
}