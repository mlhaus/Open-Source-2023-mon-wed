package com.kirkwood.contribution2;

public class Map2 {
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
