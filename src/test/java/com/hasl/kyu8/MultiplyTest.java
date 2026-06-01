package com.hasl.kyu8;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MultiplyTest {

    @Test
    public void testMultiply() {
        assertThat(Multiply.multiply(2, 3)).isEqualTo(6);
        assertThat(Multiply.multiply(0, 5)).isEqualTo(0);
        assertThat(Multiply.multiply(-2, 4)).isEqualTo(-8);
        assertThat(Multiply.multiply(7, -3)).isEqualTo(-21);
    }
}