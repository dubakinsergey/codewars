package com.hasl.collections.hashset;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsogramsSetTest {

    @Test
    public void testIsIsogram() {
        assertThat(IsogramsSet.isIsogram("Dermatoglyphics")).isTrue();
        assertThat(IsogramsSet.isIsogram("aba")).isFalse();
        assertThat(IsogramsSet.isIsogram("moOse")).isFalse();
        assertThat(IsogramsSet.isIsogram("")).isTrue();
    }
}