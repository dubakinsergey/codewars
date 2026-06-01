package com.hasl.kyu8;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ReturnNegativeTest {

    @Test
    public void testMakeNegative() {
        assertThat(ReturnNegative.makeNegative(5)).isEqualTo(-5);
        assertThat(ReturnNegative.makeNegative(-3)).isEqualTo(-3);
        assertThat(ReturnNegative.makeNegative(0)).isEqualTo(0);
        assertThat(ReturnNegative.makeNegative(42)).isEqualTo(-42);
    }
}