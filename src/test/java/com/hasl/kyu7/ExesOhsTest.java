package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExesOhsTest {

    @Test
    public void testGetXO() {
        assertThat(ExesOhs.getXO("xo")).isTrue();
        assertThat(ExesOhs.getXO("xxOo")).isTrue();
        assertThat(ExesOhs.getXO("xxxm")).isFalse();
        assertThat(ExesOhs.getXO("Oo")).isFalse();
        assertThat(ExesOhs.getXO("ooom")).isFalse();
        assertThat(ExesOhs.getXO("")).isTrue();
    }
}