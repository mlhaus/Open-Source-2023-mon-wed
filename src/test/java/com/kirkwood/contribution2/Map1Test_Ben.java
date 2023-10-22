package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Ben {

    @Test
    void mapShare_BenCollins() {
        // mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        Map<String, String> map2 = Map1.mapShare_BenCollins(map1);
        assertEquals("aaa", map2.get("a"));
        assertEquals("aaa", map2.get("b"));
        assertFalse(map2.containsKey("c"));
    }

    @Test
    void mapShare_BenCollins_2() {
        // mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("b", "xyz");
        map1.put("c", "ccc");
        Map<String, String> map2 = Map1.mapShare_BenCollins(map1);
        assertEquals("xyz", map2.get("b"));
        assertFalse(map2.containsKey("c"));
    }

    @Test
    void mapShare_BenCollins_3() {
        // mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("c", "meh");
        map1.put("d", "hi");
        Map<String, String> map2 = Map1.mapShare_BenCollins(map1);
        assertEquals("aaa", map2.get("a"));
        assertEquals("aaa", map2.get("b"));
        assertEquals("hi", map2.get("d"));
        assertFalse(map2.containsKey("c"));
    }

    @Test
    void mapShare_BenCollins_4() {
        // mapShare({"a": "xyz", "b": "1234", "c": "yo", "z": "zzz"}) → {"a": "xyz", "b": "xyz", "z": "zzz"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "xyz");
        map1.put("b", "1234");
        map1.put("c", "yo");
        map1.put("z", "zzz");
        Map<String, String> map2 = Map1.mapShare_BenCollins(map1);
        assertEquals("xyz", map2.get("a"));
        assertEquals("xyz", map2.get("b"));
        assertEquals("zzz", map2.get("z"));
        assertFalse(map2.containsKey("c"));
    }

    @Test
    void mapShare_BenCollins_5() {
        // mapShare({"a": "xyz", "b": "1234", "c": "yo", "d": "ddd", "e": "everything"}) → {"a": "xyz", "b": "xyz", "d": "ddd", "e": "everything"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "xyz");
        map1.put("b", "1234");
        map1.put("c", "yo");
        map1.put("d", "ddd");
        map1.put("e", "everything");
        Map<String, String> map2 = Map1.mapShare_BenCollins(map1);
        assertEquals("xyz", map2.get("a"));
        assertEquals("xyz", map2.get("b"));
        assertEquals("ddd", map2.get("d"));
        assertEquals("everything", map2.get("e"));
        assertFalse(map2.containsKey("c"));
    }

    @Test
    void mapShare_BenCollins_6() {
        // mapShare({"a": "aaa", "z": "zzz", "t": "ttt"}) → {"a": "aaa", "b": "aaa"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("z", "zzz");
        map1.put("t", "ttt");
        Map<String, String> map2 = Map1.mapShare_BenCollins(map1);
        assertEquals("aaa", map2.get("a"));
        assertEquals("zzz", map2.get("z"));
        assertEquals("ttt", map2.get("t"));
    }
}