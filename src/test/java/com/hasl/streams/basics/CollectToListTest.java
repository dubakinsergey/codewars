package com.hasl.streams.basics;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectToListTest {

    @Test
    public void testCollectSquares() {
        assertThat(CollectToList.collectSquares(List.of(1, 2, 3))).containsExactly(1, 4, 9);
        assertThat(CollectToList.collectSquares(List.of())).isEmpty();
    }
}