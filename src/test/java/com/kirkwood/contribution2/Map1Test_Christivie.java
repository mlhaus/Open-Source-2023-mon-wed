package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Christivie {

    @Test
    void mapShareChristivie() {
        // mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
        Map< String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        Map<String, String> map2 = Map1.mapShareChristivie(map);
        assertEquals("aaa",map2.get("a"));
        assertEquals("aaa",map2.get("b"));
        map.clear();
        map2.clear();
        // mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
        Map< String, String> map3 = new HashMap<>();
        map3.put("b", "xyz");
        map3.put("c", "ccc");
        Map<String, String> map4 = Map1.mapShareChristivie(map3);
        assertEquals("xyz",map4.get("b"));
        // mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
        Map<String, String> map5 = new HashMap<>();
        map5.put("a", "aaa");
        map5.put("c","meh");
        map5.put("d", "hi");
        Map<String, String> map0 = Map1.mapShareChristivie(map5);
        assertEquals("aaa", map0.get("a"));
        assertEquals("aaa", map0.get("b"));
        assertEquals("hi", map0.get("d"));

    }
}