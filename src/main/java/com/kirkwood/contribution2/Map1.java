package com.kirkwood.contribution2;

import java.util.Map;

public class Map1 {
    public Map<String, String> mapShareChristivie(Map<String, String> map) {
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }
}
