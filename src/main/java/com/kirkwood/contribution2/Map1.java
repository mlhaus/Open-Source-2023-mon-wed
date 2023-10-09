package com.kirkwood.contribution2;

import java.util.*;
import java.util.Map;
import java.util.Map;

public class Map1 {
    public static Map<String, String> mapShare_anthonytalamantes(Map<String, String> map) {
        map.remove("c");
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        return map;
    }
}

