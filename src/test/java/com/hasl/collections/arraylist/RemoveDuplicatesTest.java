package com.hasl.collections.arraylist;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        assertThat(RemoveDuplicates.removeDuplicates(List.of(1, 2, 2, 3, 3, 3)))
                .containsExactly(1, 2, 3);
        assertThat(RemoveDuplicates.removeDuplicates(List.of(1, 1, 1)))
                .containsExactly(1);
        assertThat(RemoveDuplicates.removeDuplicates(List.of()))
                .isEmpty();

        assertThat(RemoveDuplicates.removeDuplicatesForEach(List.of(1, 2, 2, 3, 3, 3)))
                .containsExactly(1, 2, 3);
        assertThat(RemoveDuplicates.removeDuplicatesForEach(List.of(1, 1, 1)))
                .containsExactly(1);
        assertThat(RemoveDuplicates.removeDuplicatesForEach(List.of()))
                .isEmpty();
    }
}