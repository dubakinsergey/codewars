package com.hasl.kyu8;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MapDoubleTest {

    @Test
    public void testMap() {
        assertThat(MapDouble.map(new int[]{1, 2, 3})).containsExactly(2, 4, 6);
        assertThat(MapDouble.map(new int[]{0, 1, 2})).containsExactly(0, 2, 4);
        assertThat(MapDouble.map(new int[]{})).isEmpty();
    }
}