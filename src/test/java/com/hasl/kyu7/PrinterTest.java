package com.hasl.kyu7;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrinterTest {

    @Test
    public void testPrinterError() {
        assertThat(Printer.printerError("aaabbbbhaijjjm")).isEqualTo("0/14");
        assertThat(Printer.printerError("aaaxbbbbyyhwawiwjjjwwm")).isEqualTo("8/22");
        assertThat(Printer.printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbb")).isEqualTo("0/34");
        assertThat(Printer.printerError("")).isEqualTo("0/0");
    }
}