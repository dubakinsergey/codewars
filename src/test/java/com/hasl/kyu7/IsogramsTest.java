package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsogramsTest {

    @Test
    public void testIsIsogram() {
        assertThat(Isograms.isIsogram("Dermatoglyphics")).isTrue();
        assertThat(Isograms.isIsogram("aba")).isFalse();
        assertThat(Isograms.isIsogram("moOse")).isFalse();
        assertThat(Isograms.isIsogram("")).isTrue();
        assertThat(Isograms.isIsogram("abcdef")).isTrue();
    }
}