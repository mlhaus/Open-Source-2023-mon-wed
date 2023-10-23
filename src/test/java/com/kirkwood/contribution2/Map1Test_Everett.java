package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Everett {

    @Test
    void topping1_everett1() {
        // topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "peanuts");
        Map<String, String> map2 = Map1.topping1_everett(map);
        assertEquals("butter", map2.get("bread"));
        assertEquals("cherry", map2.get("ice cream"));
    }

    @Test
    void topping1_everett2() {
        // topping1({}) → {"bread": "butter"}
        Map<String, String> map = new HashMap<>();
        map.put("bread", "butter");
        Map<String, String> map2 = Map1.topping1_everett(map);
        assertEquals("butter", map2.get("bread"));
    }

    @Test
    void topping1_everett3() {
        // topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
        Map<String, String> map = new HashMap<>();
        map.put("pancake", "syrup");
        Map<String, String> map2 = Map1.topping1_everett(map);
        assertEquals("butter", map2.get("bread"));
        assertEquals("syrup", map2.get("pancake"));
    }

    @Test
    void topping1_everett4() {
        // topping1({"bread": "dirt", "ice cream": "strawberries"}) → {"bread": "butter", "ice cream": "cherry"}
        Map<String, String> map = new HashMap<>();
        map.put("bread", "dirt");
        map.put("ice cream", "strawberries");
        Map<String, String> map2 = Map1.topping1_everett(map);
        assertEquals("butter", map2.get("bread"));
        assertEquals("cherry", map2.get("ice cream"));
    }

    @Test
    void topping1_everett5() {
        // topping1({"bread": "jam", "ice cream": "strawberries", "salad": "oil"}) → {"bread": "butter", "ice cream": "cherry", "salad": "oil"}
        Map<String, String> map = new HashMap<>();
        map.put("bread", "jam");
        map.put("ice cream", "strawberries");
        map.put("salad", "oil");
        Map<String, String> map2 = Map1.topping1_everett(map);
        assertEquals("butter", map2.get("bread"));
        assertEquals("cherry", map2.get("ice cream"));
        assertEquals("oil", map2.get("salad"));
    }

}