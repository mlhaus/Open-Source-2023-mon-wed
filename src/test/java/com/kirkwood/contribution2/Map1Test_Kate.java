package com.kirkwood.contribution2;

import com.kirkwood.contribution2.Map1;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Kate {
    @Test
    void topping2_kate() {
        // topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "cherry");
        Map<String, String> map2 = Map1.topping2_kate(map1);
        assertEquals("cherry", map2.get("yogurt"));
        assertEquals("cherry", map2.get("ice cream"));
        // topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts",
        //                                                          "ice cream": "cherry"}
        Map<String, String> map3 = new HashMap<>();
        map3.put("spinach", "dirt");
        map3.put("ice cream", "cherry");
        Map<String, String> map4 = Map1.topping2_kate(map3);
        assertEquals("cherry", map4.get("yogurt"));
        assertEquals("nuts", map4.get("spinach"));
        assertEquals("cherry", map4.get("ice cream"));
        // topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
        Map<String, String> map5 = new HashMap<>();
        map5.put("yogurt", "salt");
        Map<String, String> map6 = Map1.topping2_kate(map5);
        assertEquals("salt", map6.get("yogurt"));
        // topping2({"yogurt": "salt", "bread": "butter"}) → {"yogurt": "salt", "bread": "butter"}
        Map<String, String> map7 = new HashMap<>();
        map7.put("yogurt", "salt");
        map7.put("bread", "butter");
        Map<String, String> map8 = Map1.topping2_kate(map7);
        assertEquals("salt", map8.get("yogurt"));
        assertEquals("butter", map8.get("bread"));
        // topping2({}) → {}
        Map<String, String> map9 = new HashMap<>();
        Map<String, String> map10 = Map1.topping2_kate(map9);
        assertTrue(map10.isEmpty());
        // topping2({"ice cream": "air", "salad": "oil"}) → {"yogurt": "air", "ice cream": "air", "salad": "oil"}
        Map<String, String> map11 = new HashMap<>();
        map11.put("ice cream", "air");
        map11.put("salad", "oil");
        Map<String, String> map12 = Map1.topping2_kate(map11);
        assertEquals("air", map12.get("yogurt"));
        assertEquals("air", map12.get("ice cream"));
        assertEquals("oil", map12.get("salad"));
        // topping2({"spinach" : "butter", "bread" : "butter", "ice cream" : "chocolate"}) →
        //                  {"yogurt" : "chocolate", "spinach" : "nuts", "bread" : "butter", "ice cream" : "chocolate"}
        Map<String, String> map13 = new HashMap<>()
        {{
            put("spinach", "butter");
            put("bread", "butter");
            put("ice cream", "chocolate");
        }};
        Map<String, String> map14 = Map1.topping2_kate(map13);
        assertEquals("chocolate", map14.get("yogurt"));
        assertEquals("nuts", map14.get("spinach"));
        assertEquals("butter", map14.get("bread"));
        assertEquals("chocolate", map14.get("ice cream"));
    }
}