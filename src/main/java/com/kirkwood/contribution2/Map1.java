package com.kirkwood.contribution2;

import java.util.Map;

public class Map1 {
    public static Map<String, String> mapAB2_Darryl(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")){
            if(map.get("a").equals(map.get("b"))){
                map.remove("a");
                map.remove("b");
            }
        }
        return map;

    }
}
