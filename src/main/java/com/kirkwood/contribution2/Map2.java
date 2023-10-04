package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static Map<String, Integer> wordLen_BenCollins(String[] strings) {
        Map<String, Integer> counter = new HashMap<>();
        for(String element : strings) {
            if(!counter.containsKey(element)) {
                counter.put(element, element.length());
            }
        }
        return counter;
    }
}
