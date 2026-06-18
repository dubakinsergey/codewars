package com.hasl.streams.grouping;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupByFirstLetterTest {

    @Test
    public void testGroupByFirstLetter() {
        Map<Character, List<String>> expected = Map.of(
                'a', List.of("apple", "apricot"),
                'b', List.of("banana", "blueberry")
        );
        assertThat(GroupByFirstLetter.groupByFirstLetter(List.of("apple", "banana", "apricot", "blueberry")))
                .isEqualTo(expected);
        assertThat(GroupByFirstLetter.groupByFirstLetter(List.of())).isEmpty();
    }
}