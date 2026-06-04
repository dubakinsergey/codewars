package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PopulationGrowthTest {

    @Test
    public void testNbYear() {
        assertThat(PopulationGrowth.nbYear(1000, 2.0, 50, 1200)).isEqualTo(3);
        assertThat(PopulationGrowth.nbYear(1500, 5.0, 100, 5000)).isEqualTo(15);
        assertThat(PopulationGrowth.nbYear(1500000, 2.5, 10000, 2000000)).isEqualTo(10);
        assertThat(PopulationGrowth.nbYear(1000, 0.0, 50, 1200)).isEqualTo(4);
    }
}