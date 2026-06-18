package com.hasl.streams.grouping;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupByLengthTest {

    @Test
    public void testGroupByLength() {
        Map<Integer, List<String>> expected = Map.of(
                1, List.of("a"),
                2, List.of("ab", "ab"),
                3, List.of("abc"),
                4, List.of("abcd")
        );
        assertThat(GroupByLength.groupByLength(List.of("a", "ab", "abc", "ab", "abcd")))
                .isEqualTo(expected);
        assertThat(GroupByLength.groupByLength(List.of())).isEmpty();
    }
}