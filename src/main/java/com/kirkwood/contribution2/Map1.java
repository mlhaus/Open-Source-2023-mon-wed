package com.kirkwood.contribution2;

public class Map<String String> mapBullyH_Akoi(Map<String, String> map){
    String aStuff = map.get("a");
    if(map.get("a") != null && !aStuff.equals("")) {
        map.put("b", aStuff);
        map.put("a", "");
    }
    return map;
}

