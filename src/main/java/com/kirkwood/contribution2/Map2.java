package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static Map<String, Integer> wordLen_anthonytalamantes(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : strings) {
            result.put(str, str.length());
        }
        return result;
    }
}
