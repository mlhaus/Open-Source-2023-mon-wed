package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map1Test_ryalie {
    public static Map<String, String> mapAB3_ryalie(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }
        if (!map.containsKey("a") && map.containsKey("b")) {
            map.put("a", map.get("b"));
        }
        return map;
    }
}
