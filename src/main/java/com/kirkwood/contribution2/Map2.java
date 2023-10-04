package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static Map<String, Integer> wordLen_everett(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String str :strings) {
            map.put(str, str.length());
        }
        return map;
    }
}
