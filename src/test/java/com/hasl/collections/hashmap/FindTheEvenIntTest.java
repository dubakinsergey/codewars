package com.hasl.collections.hashmap;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FindTheEvenIntTest {

    @Test
    public void testFindEven() {
        assertThat(FindTheEvenInt.findEven(List.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 4))).isEqualTo(2);
        assertThat(FindTheEvenInt.findEven(List.of(1, 1, 2))).isEqualTo(1);
        assertThat(FindTheEvenInt.findEven(List.of(0))).isZero();
    }
}