package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static String wordAppend_MitchellStirmel(String[] strings) {

        Map<String, Integer> map    = new HashMap<String, Integer>();
        String               result = "";

        for (int i = 0; i < strings.length; i++) {

            String key = strings[i];

            if (map.containsKey(key)) {
                int val = map.get(key);
                val++;
                if (val % 2 == 0) {
                    result += key;
                }
                map.put(key, val);
            } else {
                map.put(key, 1);
            }

        }

        return result;
    }
}
