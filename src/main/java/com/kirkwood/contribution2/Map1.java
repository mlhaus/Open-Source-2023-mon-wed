package com.kirkwood.contribution2;

import java.util.*;
import java.util.Map;
import java.util.Map;

public class Map1 {
  
  public static Map<String, String> mapBullyH_Akoi(Map<String, String> map){
      String aStuff = map.get("a");
      if(map.get("a") != null && !aStuff.equals("")) {
        map.put("b", aStuff);
        map.put("a", "");
      }
      return map;
  }

    public static Map<String, String> mapShare_anthonytalamantes(Map<String, String> map) {
        map.remove("c");
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        return map;
    }

    public static Map<String, String> mapShare_julien(Map<String, String> map) {
        map.remove("c");
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;
    }

    public static Map<String, String> topping3_marc(Map<String, String> map) {
        if (map.containsKey("potato") && !map.get("potato").equals("")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad") && !map.get("salad").equals("")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public Map<String, String> mapAB3_ryalie(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }
        if (!map.containsKey("a") && map.containsKey("b")) {
            map.put("a", map.get("b"));
        }
        return map;
    }

    public static Map<String, String> mapAB2_mohmed(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }


    public static Map<String, String> mapAB4_MitchellStirmel(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");
            if (a.length() > b.length()) map.put("c", a);
            else if (b.length() > a.length()) map.put("c", b);
            else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public static Map<String, String> mapAB_Wyatt(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }


    public Map<String, String> topping1_james(Map<String, String> map) {
        map.put("bread", "butter");
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        return map;
    }

    public Map<String, String> mapAB4_chris(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");
            if (a.length() > b.length()) map.put("c", a);
            else if (b.length() > a.length()) map.put("c", b);
            else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public static Map<String, String> topping2_kate(Map<String, String> map) {
        if (map.containsKey("ice cream") && !map.get("ice cream").isEmpty()) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach") && !map.get("spinach").isEmpty()) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    public static Map<String, String> mapShare_BenCollins(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        if (map.containsKey("c")) {
            map.remove("c");
        }
        return map;
    }

    public static Map<String, String> topping1_everett(Map<String, String> map) {
        map.put("bread", "butter");
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        return map;
    }

    public static Map<String, String> mapAB_Jennifer(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public static Map<String, String> mapAB2_Darryl(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public static Map<String, String> mapAB3_jared(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }


    public Map<String, String> topping2_andrew(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream")); // Set "yogurt" to the value of "ice cream"
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts"); // Change the value of "spinach" to "nuts"
        }
        return map;
    }

    public static Map<String, String> mapAB4_tyler(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() > map.get("b").length()) {
                map.put("c", map.get("a"));
            } else if (map.get("b").length() > map.get("a").length()) {
                map.put("c", map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

}

