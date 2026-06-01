package com.hasl.kyu8;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BoolToYesNoTest {

    @Test
    public void testBoolToWord() {
        assertThat(BoolToYesNo.boolToWord(true)).isEqualTo("Yes");
        assertThat(BoolToYesNo.boolToWord(false)).isEqualTo("No");
    }
}