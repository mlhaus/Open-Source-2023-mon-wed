package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public String wordAppend_Darryl(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";
        for(int i = 0; i < strings.length; i++){
            if(map.containsKey(strings[i])){
                map.put(strings[i], map.get(strings[i]) +1);
                if((map.get(strings[i]) % 2) == 0){
                    result+= strings[i];
                }
            }
            else{
                map.put(strings[i], 1);
            }

        }
        return result;
    }
}
