package com.hasl.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
    public static List<Integer> filterIntegers(List<Object> list) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                result.add((Integer) list.get(i));
            }
        }
        return result;
    }
}

// ["a", 1, "b", 2, 3] → [1, 2, 3]
// оставить только целые числа (Integer)