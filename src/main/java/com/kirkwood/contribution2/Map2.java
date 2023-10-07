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


    public Map<String, String> pairs_andrew(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String str: strings) {
            map.put(str.substring(0, 1), str.substring(str.length()-1, str.length()));
        }
        return map;
    }

    public static Map<String, String> pairs_tyler(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < strings.length; i++) {
            String tmp = strings[i];
            String first = String.valueOf(tmp.charAt(0));
            String last = String.valueOf(tmp.charAt(tmp.length() - 1));
            map.put(first, last);
        }
        return map;
    }

}
