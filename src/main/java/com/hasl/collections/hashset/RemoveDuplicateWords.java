package com.hasl.collections.hashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
    public static String removeDuplicates(String sentence) {

        String[] word = sentence.split(" ");
        Set<String> set = new LinkedHashSet<>(); // вместо HashSet (что бы сохранить порядок)

        for (int i = 0; i < word.length; i++) {
            set.add(word[i]);
        }
        return String.join(" ", set);
    }
}

// "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"
// → "alpha beta gamma delta"