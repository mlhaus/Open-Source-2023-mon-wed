package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1_AkoiTest {

    @Test
    void mapBullyH_Akoi() {
//        mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
        Map<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        Map<String, String> map2 = Map1.mapBullyH_Akoi(map);
        assertEquals("", map2.get("a"));
        assertEquals("candy", map2.get("b"));

        Map<String, String> map3 = new HashMap<>();
        map.put("a", "candy");
        Map<String, String> map4 = Map1.mapBullyH_Akoi(map);
        assertEquals("", map4.get("a"));
        assertEquals("candy", map4.get("b"));

        Map<String, String> map5 = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "carrot");
        map.put("c", "meh");
        Map<String, String> map6 = Map1.mapBullyH_Akoi(map);
        assertEquals("", map6.get("a"));
        assertEquals("candy", map6.get("b"));
        assertEquals("meh", map6.get("c"));



    }

}