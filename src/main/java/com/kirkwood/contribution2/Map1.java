package com.kirkwood.contribution2;

import java.util.Map;

public class Map1 {
    public static Map<String, String> topping1_everett(Map<String, String> map) {
        map.put("bread", "butter");
        if(map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        return map;
    }
}
