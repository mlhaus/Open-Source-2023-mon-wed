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

    public static Map<String, String> mapAB_Jennifer(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            if(map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public static Map<String, String> mapAB2_Darryl(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")){
            if(map.get("a").equals(map.get("b"))){
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public static Map<String, String> mapAB3_jared(Map<String, String> map) {
        if(map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if(map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }
          
          
    public Map<String, String> topping2_andrew(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream")); // Set "yogurt" to the value of "ice cream"
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts"); // Change the value of "spinach" to "nuts"
        }
        return map;
    }


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
