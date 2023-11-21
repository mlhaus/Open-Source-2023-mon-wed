package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
class Map1Test_ryalieTest {

    @Test
    void mapAB3_ryalie() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "apple");
        Map<String, String> map2 = Map1Test_ryalie.mapAB3_ryalie(map);
        assertEquals("apple", map.get(("b")));

        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "banana");
        Map<String, String>  map4 = Map1Test_ryalie.mapAB3_ryalie(map3);
        assertEquals("banana", map3.get("a"));

    }
}