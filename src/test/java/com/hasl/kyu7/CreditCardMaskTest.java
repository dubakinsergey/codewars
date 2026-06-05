package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreditCardMaskTest {

    @Test
    public void testMaskify() {
        assertThat(CreditCardMask.maskify("4556364607935616")).isEqualTo("############5616");
        assertThat(CreditCardMask.maskify("64607935616")).isEqualTo("#######5616");
        assertThat(CreditCardMask.maskify("1")).isEqualTo("1");
        assertThat(CreditCardMask.maskify("")).isEmpty();
        assertThat(CreditCardMask.maskify("Skippy")).isEqualTo("##ippy");
    }
}