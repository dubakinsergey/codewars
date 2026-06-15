package com.hasl.collections.hashset;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveDuplicateWordsTest {

    @Test
    public void testRemoveDuplicates() {
        String input = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        String expected = "alpha beta gamma delta";
        assertThat(RemoveDuplicateWords.removeDuplicates(input)).isEqualTo(expected);

        assertThat(RemoveDuplicateWords.removeDuplicates("one one two")).isEqualTo("one two");
        assertThat(RemoveDuplicateWords.removeDuplicates("")).isEmpty();
    }
}