package com.kirkwood.contribution2;

import java.util.*;
import java.util.Map;
import java.util.Map;

public class Map1 {
    public static Map<String, String> mapAB4_Matthew_Baccam(Map<String, String> map) {
        if(map.get("a") != null && map.get("b") != null){
            if(map.get("a").length() == map.get("b").length()){
                map.put("a", "");
                map.put("b", "");
            }
            if(map.get("a").length() != map.get("b").length()){
                map.put("c", map.get("a").length() > map.get("b").length() ? map.get("a") : map.get("b"));
            }
        }
        return map;
    }
}

