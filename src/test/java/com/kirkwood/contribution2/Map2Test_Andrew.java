package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Andrew {

    @Test
    void pairs_andrew_1() {
        Map<String, String> map = new HashMap<>();
        // pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        map.put("b", "g");
        map.put("c", "e");
        String[] strings = {"code", "bug"};
        Map<String, String> map2 = Map2.pairs_andrew(strings);
        assertEquals(map, map2);
        assertTrue(map.equals(map2));
    }

    @Test
    void pairs_andrew_2(){
        Map<String, String> map = new HashMap<>();
        // pairs(["man", "moon", "main"]) → {"m": "n"}
        map.put("m", "n");
        String[] strings = {"man", "moon", "main"};
        Map<String, String> map2 = Map2.pairs_andrew(strings);
        assertEquals(map, map2);
        assertTrue(map.equals(map2));
    }

    @Test
    void pairs_andrew_3(){
        Map<String, String> map = new HashMap<>();
        //pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
        map.put("g", "d");
        map.put("m", "n");
        map.put("n", "t");
        String[] strings = {"man", "moon", "good", "night"};
        Map<String, String> map2 = Map2.pairs_andrew(strings);
        assertEquals(map, map2);
        assertTrue(map.equals(map2));
    }

    @Test
    void pairs_andrew_4(){
        Map<String, String> map = new HashMap<>();
        // pairs([]) → {}
        // nothing to put into the map
        String[] strings = {}; // nothing to put into the strings
        Map<String, String> map2 = Map2.pairs_andrew(strings);
        assertEquals(map, map2);
        assertTrue(map.equals(map2));
    }

    @Test
    void pairs_andrew_5(){
        Map<String, String> map = new HashMap<>();
        // pairs(["a", "b"]) → {"a": "a", "b": "b"}
        map.put("a", "a");
        map.put("b", "b");
        String[] strings = {"a", "b"};
        Map<String, String> map2 = Map2.pairs_andrew(strings);
        assertEquals(map, map2);
        assertTrue(map.equals(map2));
    }

    @Test
    void pairs_andrew_6(){
        Map<String, String> map = new HashMap<>();
        // pairs(["are", "codes", "and", "cods"]) → {"a": "d", "c": "s"}
        map.put("a", "d");
        map.put("c", "s");
        String[] strings = {"are", "codes", "and", "cods"};
        Map<String, String> map2 = Map2.pairs_andrew(strings);
        assertEquals(map, map2);
        assertTrue(map.equals(map2));
    }
}