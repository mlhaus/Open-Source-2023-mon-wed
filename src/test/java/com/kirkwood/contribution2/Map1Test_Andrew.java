package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Andrew {

    @Test
    void topping2_andrew_1() {
        Map<String, String> map = new HashMap<>();
        // topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
        map.put("ice cream", "cherry");
        Map<String, String> map2 = Map1.topping2_andrew(map);
        assertEquals("cherry", map2.get("ice cream"));
        assertEquals("cherry", map2.get("yogurt"));
    }

    @Test
    void topping2_andrew_2() {
        Map<String, String> map = new HashMap<>();
        // topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
        map.put("spinach", "dirt");
        map.put("ice cream", "cherry");
        Map<String, String> map2 = Map1.topping2_andrew(map);
        assertEquals("cherry", map2.get("yogurt"));
        assertEquals("nuts", map2.get("spinach"));
        assertEquals("cherry", map2.get("ice cream"));
    }

    @Test
    void topping2_andrew_3(){
        Map<String, String> map = new HashMap<>();
        // topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
        map.put("yogurt", "salt");
        Map<String, String> map2 = Map1.topping2_andrew(map);
        assertEquals("salt", map2.get("yogurt"));
        assertTrue(map == map2);
    }

    @Test
    void topping2_andrew_4(){
        Map<String, String> map = new HashMap<>();
        // topping2({"yogurt": "salt", "bread": "butter"}) → {"yogurt": "salt", "bread": "butter"}
        map.put("yogurt", "salt");
        map.put("bread", "butter");
        Map<String, String> map2 = Map1.topping2_andrew(map);
        assertEquals("salt", map2.get("yogurt"));
        assertEquals("butter", map2.get("bread"));
    }

    @Test
    void topping2_andrew_5(){
        Map<String, String> map = new HashMap<>();
        // topping2({}) → {}
        Map<String, String> map2 = Map1.topping2_andrew(map);
        assertTrue(map == map2);
        assertEquals(map, map2);
    }

    @Test
    void topping2_andrew_6(){
        Map<String, String> map = new HashMap<>();
        // topping2({"ice cream": "air", "salad": "oil"}) → {"yogurt": "air", "ice cream": "air", "salad": "oil"}
        map.put("ice cream", "air");
        map.put("salad", "oil");
        Map<String, String> map2 = Map1.topping2_andrew(map);
        assertEquals("air", map2.get("yogurt"));
        assertEquals("air", map2.get("ice cream"));
        assertEquals("oil", map2.get("salad"));
    }
}