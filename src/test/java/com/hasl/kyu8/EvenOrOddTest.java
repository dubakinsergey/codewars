package com.hasl.kyu8;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EvenOrOddTest {

    @Test
    public void testEvenOrOdd() {
        assertThat(EvenOrOdd.evenOrOdd(2)).isEqualTo("Even");
        assertThat(EvenOrOdd.evenOrOdd(3)).isEqualTo("Odd");
        assertThat(EvenOrOdd.evenOrOdd(0)).isEqualTo("Even");
        assertThat(EvenOrOdd.evenOrOdd(-1)).isEqualTo("Odd");
    }
}