package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Map1Test_donald {

    @Test
    void topping1_donald() {
        Map < String, String > map = new HashMap<>();
        map.put("ice cream", "peanuts");
        Map <String, String > map2 = Map1.topping1_donald(map);
        assertEquals("butter", map2.get("bread"));
        assertEquals("cherry", map2.get("ice cream"));
    }
}