package com.hasl.kyu7;

public class DnaStrand {
    public static String makeComplement(String dna) {

        StringBuilder sb = new StringBuilder();

        for (char el : dna.toCharArray()) {

            switch (el) {
                case 'A' -> sb.append('T');
                case 'T' -> sb.append('A');
                case 'C' -> sb.append('G');
                case 'G' -> sb.append('C');
                default -> sb.append(el); // на случай других символов
            }
        }
        return sb.toString();
    }
}

// "ATTGC" → "TAACG"
// "GTAT" → "CATA"