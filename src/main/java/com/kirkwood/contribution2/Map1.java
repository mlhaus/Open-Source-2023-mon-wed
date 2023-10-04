package com.kirkwood.contribution2;

import java.util.*;

public class Map1 {
    public static Map<String, String> topping2_kate(Map<String, String> map) {
        if(map.containsKey("ice cream") && !map.get("ice cream").isEmpty()) {
            map.put("yogurt", map.get("ice cream"));
        }
        if(map.containsKey("spinach") && !map.get("spinach").isEmpty()) {
            map.put("spinach", "nuts");
        }
        return map;
    }
}