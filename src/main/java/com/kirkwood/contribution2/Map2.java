package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
//firstswap
    public static String[] firstSwap_max(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            String str = String.valueOf(strings[i].charAt(0));
            if(!map.containsKey(str)){
                map.put(str, i);
            }
            else if(map.get(str) != -1){
                String hold = strings[map.get(str)];
                strings[map.get(str)] = strings[i];
                strings[i] = hold;
                map.put(str, -1);
            }
        }
        return strings;
    }

}
