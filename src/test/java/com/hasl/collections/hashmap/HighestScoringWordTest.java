package com.hasl.collections.hashmap;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HighestScoringWordTest {

    @Test
    public void testHighestScoringWord() {
        assertThat(HighestScoringWord.highestScoringWord("man i need a taxi up to ubud"))
                .isEqualTo("taxi");
        assertThat(HighestScoringWord.highestScoringWord("what time are we climbing up the volcano"))
                .isEqualTo("volcano");
        assertThat(HighestScoringWord.highestScoringWord("take me to semynak"))
                .isEqualTo("semynak");
    }
}