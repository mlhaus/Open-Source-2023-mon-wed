package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Julien {

    @Test
    void mapShare_julien() {
        Map<String, String> map1a = new HashMap<>();
        map1a.put("a", "aaa");
        map1a.put("b", "bbb");
        map1a.put("c", "ccc");
        Map<String, String> map1b = Map1.mapShare_julien(map1a);
        assertEquals("aaa", map1a.get("a"));
        assertEquals("aaa", map1a.get("b"));
        assertNull(map1a.get("c"));

        Map<String, String> map2a = new HashMap<>();
        map2a.put("b", "xyz");
        map2a.put("c", "ccc");
        Map<String, String> map2b = Map1.mapShare_julien(map2a);
        assertEquals("xyz", map2a.get("b"));
        assertNull(map1a.get("c"));
    }
}