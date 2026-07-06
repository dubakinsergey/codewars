package com.hasl.kyu6;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhoLikesItTest {

    @Test
    public void testWhoLikesIt() {
        assertThat(WhoLikesIt.whoLikesIt()).isEqualTo("no one likes this");
        assertThat(WhoLikesIt.whoLikesIt("Peter")).isEqualTo("Peter likes this");
        assertThat(WhoLikesIt.whoLikesIt("Jacob", "Alex")).isEqualTo("Jacob and Alex like this");
        assertThat(WhoLikesIt.whoLikesIt("Max", "John", "Mark")).isEqualTo("Max, John and Mark like this");
        assertThat(WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max")).isEqualTo("Alex, Jacob and 2 others like this");
    }
}