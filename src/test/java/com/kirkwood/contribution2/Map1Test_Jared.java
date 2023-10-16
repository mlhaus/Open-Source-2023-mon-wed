package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Jared {

    @Test
    void mapAB3_jared() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("c", "cake");
        Map<String, String> map2 = Map1.mapAB3_jared(map);
        assertEquals("aaa", map2.get("a"));
        assertEquals("aaa", map2.get("b"));
        assertEquals("cake", map2.get("c"));

        map = new HashMap<>();
        map.put("b", "bbb");
        map.put("c", "cake");
        map2 = Map1.mapAB3_jared(map);
        assertEquals("bbb", map2.get("b"));
        assertEquals("cake", map2.get("c"));

        map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "cake");
        map2 = Map1.mapAB3_jared(map);
        assertEquals("aaa", map2.get("a"));
        assertEquals("bbb", map2.get("b"));
        assertEquals("cake", map2.get("c"));

        map = new HashMap<>();
        map.put("ccc", "ccc");
        map2 = Map1.mapAB3_jared(map);
        assertEquals("ccc", map2.get("ccc"));

        map = new HashMap<>();
        map.put("c", "a");
        map.put("d", "b");
        map2 = Map1.mapAB3_jared(map);
        assertEquals("a", map2.get("c"));
        assertEquals("b", map2.get("d"));

        map = new HashMap<>();
        map2 = Map1.mapAB3_jared(map);
        assertEquals(0, map2.keySet().size());

        map = new HashMap<>();
        map.put("a", "");
        map2 = Map1.mapAB3_jared(map);
        assertEquals("", map2.get("a"));
        assertEquals("", map2.get("b"));

        map = new HashMap<>();
        map.put("b", "");
        map2 = Map1.mapAB3_jared(map);
        assertEquals("", map2.get("b"));
        assertEquals("", map2.get("a"));

        map = new HashMap<>();
        map.put("aa", "aa");
        map.put("a", "apple");
        map.put("z", "zzz");
        map2 = Map1.mapAB3_jared(map);
        assertEquals("aa", map2.get("aa"));
        assertEquals("apple", map2.get("a"));
        assertEquals("apple", map2.get("b"));
        assertEquals("zzz", map2.get("z"));

    }
}