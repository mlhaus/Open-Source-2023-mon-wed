package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static Map<String, Boolean> wordMultiple_Matthew_Baccam(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            if(!map.containsKey(strings[i])){
                map.put(strings[i], false);
            }else{
                map.put(strings[i], true);
            }
        }
        return map;
    }

}
