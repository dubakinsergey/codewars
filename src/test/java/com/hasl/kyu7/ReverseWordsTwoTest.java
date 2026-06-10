package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseWordsTwoTest {

    @Test
    public void reverseWordsTwo() {
        assertThat(ReverseWordsTwo.reverseWordsTwo("The quick brown fox jumps over the lazy dog."))
                .isEqualTo("ehT kciuq nworb xof spmuj revo eht yzal .god");
        assertThat(ReverseWordsTwo.reverseWordsTwo("hello")).isEqualTo("olleh");
        assertThat(ReverseWordsTwo.reverseWordsTwo("a b c d")).isEqualTo("a b c d");
        assertThat(ReverseWordsTwo.reverseWordsTwo("  hello  ")).isEqualTo("  olleh  ");
        assertThat(ReverseWordsTwo.reverseWordsTwo("")).isEmpty();
    }
}