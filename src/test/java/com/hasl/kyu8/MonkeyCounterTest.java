package com.hasl.kyu8;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MonkeyCounterTest {

    @Test
    public void testMonkeyCount() {
        assertThat(MonkeyCounter.monkeyCount(5)).containsExactly(1, 2, 3, 4, 5);
        assertThat(MonkeyCounter.monkeyCount(1)).containsExactly(1);
        assertThat(MonkeyCounter.monkeyCount(0)).isEmpty();
    }
}