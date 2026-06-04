package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DisemvowelTest {

    @Test
    public void testRemoveVowels() {
        assertThat(Disemvowel.removeVowels("This website is for losers LOL!"))
                .isEqualTo("Ths wbst s fr lsrs LL!");
        assertThat(Disemvowel.removeVowels("No offense but, your writing is among the worst I've ever read"))
                .isEqualTo("N ffns bt, yr wrtng s mng th wrst 'v vr rd");
        assertThat(Disemvowel.removeVowels("aAeEiIoOuU")).isEmpty();
    }
}