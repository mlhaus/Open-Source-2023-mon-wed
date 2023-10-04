package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;



public class Map2 {

    public static Map<String, String> pairs_JacobRohr(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for(String strTemp: strings){
            map.put(strTemp.substring(0,1), strTemp.substring(strTemp.length() - 1, strTemp.length()));
        }
        return map;
    }

}
