package com.kirkwood.contribution2;

import java.util.Map;

public class Map1 {

    public static Map<String, String> topping3_JacobRohr(Map<String, String> map) {
        if(map.containsKey("potato") && !map.get("potato").equals(null)){
            map.put("fries", map.get("potato"));

        }
        if(map.containsKey("salad") && !map.get("salad").equals(null)){
            map.put("spinach", map.get("salad"));

        }
        return map;
    }

}
