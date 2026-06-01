package com.hasl.kyu8;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CenturyFromYearTest {

    @Test
    public void testCentury() {
        assertThat(CenturyFromYear.century(1705)).isEqualTo(18);
        assertThat(CenturyFromYear.century(1900)).isEqualTo(19);
        assertThat(CenturyFromYear.century(1601)).isEqualTo(17);
        assertThat(CenturyFromYear.century(2000)).isEqualTo(20);
        assertThat(CenturyFromYear.century(2024)).isEqualTo(21);
    }
}