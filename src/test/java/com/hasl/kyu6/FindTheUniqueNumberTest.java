package com.hasl.kyu6;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindTheUniqueNumberTest {

    @Test
    public void testFindUnique() {
        assertThat(FindTheUniqueNumber.findUnique(new double[]{1, 1, 1, 2, 1, 1})).isEqualTo(2.0);
        assertThat(FindTheUniqueNumber.findUnique(new double[]{0, 0, 0.55, 0, 0})).isEqualTo(0.55);
    }
}