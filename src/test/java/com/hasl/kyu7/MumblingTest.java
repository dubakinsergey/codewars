package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MumblingTest {

    @Test
    public void testAccum() {
        assertThat(Mumbling.accum("abcd")).isEqualTo("A-Bb-Ccc-Dddd");
        assertThat(Mumbling.accum("RqaEzty")).isEqualTo("R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy");
        assertThat(Mumbling.accum("cwAt")).isEqualTo("C-Ww-Aaa-Tttt");
        assertThat(Mumbling.accum("")).isEmpty();
    }
}