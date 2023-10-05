package com.kirkwood.contribution2;


import java.util.HashMap;
import java.util.Map;

public class Map2 {

  public String[] allSwap_chris(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    for(int i = 0; i < strings.length; i++){
      if (!map.containsKey(Character.toString(strings[i].charAt(0)))){
        map.put(Character.toString(strings[i].charAt(0)), i);
      } else {
        String temp = strings[i];
        strings[i] = strings[map.get(Character.toString(strings[i].charAt(0)))];
        strings[map.get(Character.toString(strings[i].charAt(0)))] = temp;
        map.remove(Character.toString(strings[i].charAt(0)));
      }
    }
    return strings;
  }
}
