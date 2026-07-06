package com.hasl.kyu6;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersistentBuggerTest {

    @Test
    public void testPersistence() {
        assertThat(PersistentBugger.persistence(39)).isEqualTo(3);
        assertThat(PersistentBugger.persistence(999)).isEqualTo(4);
        assertThat(PersistentBugger.persistence(4)).isZero();
        assertThat(PersistentBugger.persistence(25)).isEqualTo(2);
    }
}