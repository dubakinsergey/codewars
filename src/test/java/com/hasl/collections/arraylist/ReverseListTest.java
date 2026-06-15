package com.hasl.collections.arraylist;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseListTest {

    @Test
    public void testReverse() {
        assertThat(ReverseList.reverse(List.of(1, 2, 3, 4)))
                .containsExactly(4, 3, 2, 1);
        assertThat(ReverseList.reverse(List.of(1)))
                .containsExactly(1);
        assertThat(ReverseList.reverse(List.of()))
                .isEmpty();
    }
}