package com.hasl.kyu6;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreatePhoneNumberTest {

    @Test
    public void testCreatePhoneNumber() {
        assertThat(CreatePhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}))
                .isEqualTo("(123) 456-7890");
        assertThat(CreatePhoneNumber.createPhoneNumber(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}))
                .isEqualTo("(111) 111-1111");
    }
}