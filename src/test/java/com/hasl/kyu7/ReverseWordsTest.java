package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseWordsTest {

    @Test
    public void testReverseWords() {
        assertThat(ReverseWords.reverseWords("The quick brown fox jumps over the lazy dog."))
                .isEqualTo("ehT kciuq nworb xof spmuj revo eht yzal .god");
        assertThat(ReverseWords.reverseWords("hello")).isEqualTo("olleh");
        assertThat(ReverseWords.reverseWords("a b c d")).isEqualTo("a b c d");
        assertThat(ReverseWords.reverseWords("  hello  ")).isEqualTo("  olleh  ");
    }
}