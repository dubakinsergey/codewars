package com.hasl.kyu8;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ReversedStringsTest {

    @Test
    public void testReverse() {
        assertThat(ReversedStrings.reverse("world")).isEqualTo("dlrow");
        assertThat(ReversedStrings.reverse("hello")).isEqualTo("olleh");
        assertThat(ReversedStrings.reverse("")).isEqualTo("");
        assertThat(ReversedStrings.reverse("a")).isEqualTo("a");
    }
}