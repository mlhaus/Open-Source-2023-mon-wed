package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> counter = new HashMap<>();
        for (String str: strings) {
            if (!counter.containsKey(str)) {
                counter.put(str, str.length());
            }
        }
        return counter;
    }

}
