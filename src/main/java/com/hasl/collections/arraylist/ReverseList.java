package com.hasl.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static List<Integer> reverse(List<Integer> list) {

        if (list.isEmpty()) {
            return new ArrayList<>();
        }
        List<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}

// [1, 2, 3, 4] → [4, 3, 2, 1]
// запрещено использовать Collections.reverse()