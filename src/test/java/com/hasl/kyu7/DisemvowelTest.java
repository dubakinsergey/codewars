package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DisemvowelTest {

    @Test
    public void testRemoveVowels() {
        assertThat(Disemvowel.removeVowelRegular("This website is for losers LOL!"))
                .isEqualTo("Ths wbst s fr lsrs LL!");
        assertThat(Disemvowel.removeVowelRegular("No offense but, your writing is among the worst I've ever read"))
                .isEqualTo("N ffns bt, yr wrtng s mng th wrst 'v vr rd");
        assertThat(Disemvowel.removeVowelRegular("aAeEiIoOuU")).isEmpty();
    }
}