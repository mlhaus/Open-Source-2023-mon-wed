package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Anthony {

    @Test
    void mapShare_anthonytalamantes() {
        // first test
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        Map<String, String> map2 = Map1.mapShare_anthonytalamantes(map);
        assertEquals("aaa", map2.get("a"));
        assertEquals("aaa", map2.get("b"));

        // second test
        map.put("b", "xyz");
        assertEquals("xyz", map2.get("b"));

        // third test
        map.put("c", "meh");
        map.put("d", "hi");
        assertEquals("hi", map2.get("d"));


    }
}