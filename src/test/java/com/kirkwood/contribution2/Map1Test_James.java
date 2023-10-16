package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_James {

    @Test
    void topping1_james() {
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "peanuts");
        Map<String, String> map2 = Map1.topping1_james(map);
        assertEquals("cherry", map2.get("ice cream"));
        assertEquals("butter", map2.get("bread"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("pancake", "syrup");
        Map<String, String> map4 = Map1.topping1_james(map3);
        assertEquals("butter", map4.get("bread"));
        assertEquals("syrup", map4.get("pancake"));

        Map<String, String> map5 = new HashMap<>();
        Map<String, String> map6 = Map1.topping1_james(map5);
        assertEquals("butter", map6.get("bread"));

        Map<String, String> map7 = new HashMap<>();
        map7.put("bread", "dirt");
        map7.put("ice cream", "strawberries");
        map7.put("salad", "oil");
        Map<String, String> map8 = Map1.topping1_james(map7);
        assertEquals("butter", map8.get("bread"));
        assertEquals("cherry", map8.get("ice cream"));
        assertEquals("oil", map8.get("salad"));

    }
}