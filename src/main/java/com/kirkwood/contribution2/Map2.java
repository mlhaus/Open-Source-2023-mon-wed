package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public Map<String, String> pairs_andrew(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String str: strings) {
            map.put(str.substring(0, 1), str.substring(str.length()-1, str.length()));
        }
        return map;
    }

}
