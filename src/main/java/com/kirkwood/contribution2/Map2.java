package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static Map<String, String> pairs_Wyatt(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String string : strings){
            map.put(String.valueOf(string.charAt(0)), String.valueOf(string.charAt(string.length() - 1)));
        }
        return map;
    }

}
