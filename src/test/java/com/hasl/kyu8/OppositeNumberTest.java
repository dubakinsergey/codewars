package com.hasl.kyu8;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OppositeNumberTest {

    @Test
    public void testOpposite() {
        assertThat(OppositeNumber.opposite(1)).isEqualTo(-1);
        assertThat(OppositeNumber.opposite(-5)).isEqualTo(5);
        assertThat(OppositeNumber.opposite(0)).isZero();
    }
}