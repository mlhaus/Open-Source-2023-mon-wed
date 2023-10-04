package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static String[] allSwap_jared(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++) {
            String currentChar = strings[i].substring(0,1);
            if(map.containsKey(currentChar)) {
                String temp = strings[i];
                strings[i] = strings[map.get(currentChar)];
                strings[map.get(currentChar)] = temp;
                map.remove(currentChar);
            } else {
                map.put(currentChar, i);
            }
        }
        return strings;
    }
}
