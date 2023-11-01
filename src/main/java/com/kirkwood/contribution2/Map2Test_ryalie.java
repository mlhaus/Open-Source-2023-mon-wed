package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2Test_ryalie {
    public static Map<String, Boolean> wordMultiple_ryalie(String[] strings) {
        Map<String, Integer> counter = new HashMap<>();
        for (String str : strings) {
            if (!counter.containsKey(str)) {
                counter.put(str, 1);
            } else {
                counter.put(str, counter.get(str) + 1);
            }
        }
        Map<String, Boolean> map = new HashMap<>();
        for (String key : counter.keySet()) {
            if (counter.get(key) >= 2) {
                map.put(key, true);
            } else {
                map.put(key, false);
            }
        }
        return map;
    }
}
