package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_jennifer {

    @Test
    void mapAB_Jennifer() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        Map<String, String> map2 = Map1.mapAB_Jennifer(map);
        assertEquals("Hi", map2.get("a"));
        assertEquals("HiThere", map2.get("ab"));
        assertEquals("There", map2.get("b"));

        Map<String, String> map3 = Map1.mapAB_Jennifer(map);
        map3.put("a", "Hi");
        Map<String, String> map4 = Map1.mapAB_Jennifer(map3);
        assertEquals("Hi", map4.get("a"));

        Map<String, String> map5 = Map1.mapAB_Jennifer(map);
        map5.put("b", "There");
        Map<String, String> map6 = Map1.mapAB_Jennifer(map5);
        assertEquals("There", map6.get("b"));

        Map<String, String> map7 = Map1.mapAB_Jennifer(map);
        map7.put("c", "meh");
        Map<String, String> map8 = Map1.mapAB_Jennifer(map7);
        assertEquals("meh", map8.get("c"));

        Map<String, String> map9 = Map1.mapAB_Jennifer(map);
        map9.put("a", "aaa");
        map9.put("ab", "nope");
        map9.put("b", "bbb");
        map9.put("c", "ccc");
        Map<String, String> map10 = Map1.mapAB_Jennifer(map9);
        assertEquals("aaa", map10.get("a"));
        assertNotEquals("nope", map10.get("ab"));
        assertEquals("bbb", map10.get("b"));
        assertEquals("ccc", map10.get("c"));

        Map<String, String> map11 = Map1.mapAB_Jennifer(map);
        map11.put("ab", "nope");
        map11.put("b", "bbb");
        map11.put("c", "ccc");
        Map<String, String> map12 = Map1.mapAB_Jennifer(map11);
        assertNotEquals("nope", map11.get("ab"));
        assertEquals("bbb", map11.get("b"));
        assertEquals("ccc", map11.get("c"));
        }
    }