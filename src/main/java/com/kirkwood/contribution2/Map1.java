package com.kirkwood.contribution2;

public class Map1 {
    public Map<String, String> topping1_james(Map<String, String> map) {
        map.put("bread", "butter");
        if(map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        return map;
    }

}

