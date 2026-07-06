package com.hasl.kyu6;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertStringToCamelCaseTest {

    @Test
    public void testToCamelCase() {
        assertThat(ConvertStringToCamelCase.toCamelCase("the-stealth-warrior")).isEqualTo("theStealthWarrior");
        assertThat(ConvertStringToCamelCase.toCamelCase("The_Stealth_Warrior")).isEqualTo("TheStealthWarrior");
        assertThat(ConvertStringToCamelCase.toCamelCase("")).isEmpty();
    }
}