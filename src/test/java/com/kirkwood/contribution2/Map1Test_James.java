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
        map.put("bread", "dirt");
        Map<String, String> map2 = Map1.topping1_james(map);
        assertEquals("cherry", map2.get("ice cream"));
        assertEquals("butter", map2.get("bread"));

    }
}