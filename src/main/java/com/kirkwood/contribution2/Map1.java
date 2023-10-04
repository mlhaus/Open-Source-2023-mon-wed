package com.kirkwood.contribution2;

public class Map1 {
    public static Map<String, String> mapAB4_tyler(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            if (map.get("a").length() > map.get("b").length()){
                map.put("c", map.get("a"));
            } else if (map.get("b").length() > map.get("a").length()){
                map.put("c", map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}
