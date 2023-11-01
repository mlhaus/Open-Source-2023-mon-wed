package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Tyler {

    @Test
    void mapAB4_tyler() {
        //1
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "cake");
        Map<String, String> output = Map1.mapAB4_tyler(map);

        assertEquals(output.get("a"), "aaa");
        assertEquals(output.get("b"), "bb");
        assertEquals(output.get("c"), "aaa");

        //2
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aa");
        map1.put("b", "bbb");
        map1.put("c", "cake");
        Map<String, String> output1 = Map1.mapAB4_tyler(map1);

        assertEquals("aa", output1.get("a"));
        assertEquals("bbb", output1.get("b"));
        assertEquals("bbb", output1.get("c"));

        //3
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aa");
        map2.put("b", "bbb");
        Map<String, String> output2 = Map1.mapAB4_tyler(map1);

        assertEquals("aa", output2.get("a"));
        assertEquals("bbb", output2.get("b"));
        assertEquals("bbb", output2.get("c"));
    }
}