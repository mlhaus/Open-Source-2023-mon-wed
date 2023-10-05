package com.kirkwood.contribution2;

import java.util.Map;

public class Map1 {

  public Map<String, String> mapAB4_chris(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b")) {
      String a = map.get("a");
      String b = map.get("b");
      if      (a.length() > b.length()) map.put("c", a);
      else if (b.length() > a.length()) map.put("c", b);
      else {
        map.put("a", "");
        map.put("b", "");
      }
    }
    return map;
  }

}
