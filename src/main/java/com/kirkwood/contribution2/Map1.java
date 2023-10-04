package com.kirkwood.contribution2;

import java.util.Map;

public class Map1 {
    public static Map<String, String> mapAB3_jared(Map<String, String> map) {
        if(map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if(map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }
}
