package com.kirkwood.contribution2;
import java.util.*;
public class Map2{

    public static Map <String, Integer> wordLen_Akoi(String[] strings){
        Map<String, Integer> map=new HashMap();
        for(String s:strings){
            map.put(s,s.length());
        }
        return map;
    }

}

