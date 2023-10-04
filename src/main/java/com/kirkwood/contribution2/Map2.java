package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public Map<String, String> pairs_christivie(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String str: strings){
            //With a string, str.substring(i, j) returns the String that starts
            // at index i and goes up to but not including j.
            map.put(str.substring(0,1), str.substring(str.length()-1, str.length()));
        }
        return map;
    }

}
