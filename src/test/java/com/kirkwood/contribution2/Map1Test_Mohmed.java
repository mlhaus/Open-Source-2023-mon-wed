package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Map1Test_Mohmed {

    @Test
    void mapAB2_mohmed() {
        Map<String, String> map = new HashMap<>();
        map.put("a","aaa");
        map.put("b","aaa");
        map.put("c","cake");
        Map<String, String> map2 = Map1.mapAB2_mohmed(map);
        assertEquals("cake",map2.get("c"));

        map.clear();
        map2.clear();

        map.put("a", "aaa");
        map.put("b", "bbb");
        assertEquals("aaa",map2.get("a"));
        assertEquals("bbb",map2.get("b"));

        map.clear();
        map2.clear();

        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "aaa");
        assertEquals("aaa",map2.get("a"));
        assertEquals("bbb",map2.get("b"));
        assertEquals("aaa",map2.get("c"));

        map.clear();
        map2.clear();

        map.put("a", "aaa");
        assertEquals("aaa",map2.get("a"));

        map.clear();
        map2.clear();

        map.put("b", "bbb");
        assertEquals("bbb",map2.get("b"));

        map.clear();
        map2.clear();

        map.put("a","");
        map.put("b","");
        map.put("c","ccc");
        assertEquals("ccc",map2.get("c"));

        map.clear();
        map2.clear();

        map.put("","");
        assertEquals("",map2.get(""));

        map.clear();
        map2.clear();

        map.put("a","a");
        map.put("b","b");
        map.put("z","zebra");
        assertEquals("a",map2.get("a"));
        assertEquals("b",map2.get("b"));
        assertEquals("zebra",map2.get("z"));

    }
}