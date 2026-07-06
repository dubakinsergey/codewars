package com.hasl.kyu6;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplesOf3Or5Test {

    @Test
    public void testSolution() {
        assertThat(MultiplesOf3Or5.solution(10)).isEqualTo(23);
        assertThat(MultiplesOf3Or5.solution(0)).isZero();
        assertThat(MultiplesOf3Or5.solution(-1)).isZero();
        assertThat(MultiplesOf3Or5.solution(20)).isEqualTo(78);
    }
}