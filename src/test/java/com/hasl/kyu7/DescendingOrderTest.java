package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DescendingOrderTest {

    @Test
    public void testSortDesc() {
        assertThat(DescendingOrder.sortDesc(42145)).isEqualTo(54421);
        assertThat(DescendingOrder.sortDesc(145263)).isEqualTo(654321);
        assertThat(DescendingOrder.sortDesc(123456789)).isEqualTo(987654321);
        assertThat(DescendingOrder.sortDesc(0)).isZero();
    }
}