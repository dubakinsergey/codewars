package com.hasl.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayDiff {
    public static List<Integer> arrayDiff(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            Integer num = a.get(i);

            if (!b.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}

// [1, 2, 2, 3], [2] → [1, 3]
// удалить из a все элементы, которые есть в b