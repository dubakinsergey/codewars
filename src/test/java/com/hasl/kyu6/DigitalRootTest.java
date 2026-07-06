package com.hasl.kyu6;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DigitalRootTest {

    @Test
    public void testDigitalRoot() {
        assertThat(DigitalRoot.digitalRoot(16)).isEqualTo(7);
        assertThat(DigitalRoot.digitalRoot(942)).isEqualTo(6);
        assertThat(DigitalRoot.digitalRoot(0)).isZero();
        assertThat(DigitalRoot.digitalRoot(123456)).isEqualTo(3);
    }
}