package com.kirkwood.contribution2;

import java.util.Map;

public class Map1 {
    public static Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;
    }
}
