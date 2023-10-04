package com.kirkwood.contribution2;

import java.util.Map;

public class Map1 {
    public static Map<String, String> mapShare_BenCollins(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        if(map.containsKey("c")) {
            map.remove("c");
        }
        return map;
    }
}
