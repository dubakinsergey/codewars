package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DnaStrandTest {

    @Test
    public void testMakeComplement() {
        assertThat(DnaStrand.makeComplement("AAAA")).isEqualTo("TTTT");
        assertThat(DnaStrand.makeComplement("ATTGC")).isEqualTo("TAACG");
        assertThat(DnaStrand.makeComplement("GTAT")).isEqualTo("CATA");
        assertThat(DnaStrand.makeComplement("")).isEmpty();
    }
}