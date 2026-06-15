package com.hasl.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);

            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}

// [1, 2, 2, 3, 3, 3] → [1, 2, 3]