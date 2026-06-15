package com.hasl.collections.hashmap;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WhereMyAnagramsTest {

    @Test
    public void testAnagrams() {
        assertThat(WhereMyAnagrams.anagrams("abba", List.of("aabb", "abcd", "bbaa", "dada")))
                .containsExactly("aabb", "bbaa");

        assertThat(WhereMyAnagrams.anagrams("racer", List.of("crazer", "carer", "racar", "caers", "racer")))
                .containsExactly("carer", "racer");

        assertThat(WhereMyAnagrams.anagrams("a", List.of("a", "b", "c")))
                .containsExactly("a");
    }
}