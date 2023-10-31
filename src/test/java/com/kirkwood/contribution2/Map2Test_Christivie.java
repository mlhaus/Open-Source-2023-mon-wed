package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Christivie {

    @Test
    void pairs_christivie() {
        // pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        Map<String, String> map = new HashMap<>();
        map.put("b", "g");
        map.put("c", "e");
        String [] strings = {"code", "bug"};
        Map<String, String> map0 = Map2.pairs_christivie(strings);
        for(Map.Entry<String, String> entry: map.entrySet()){
            String k = entry.getKey();
            String expected = entry.getValue();
            String actual = map0.get(k);
            assertEquals(expected, actual);
        }

        // pairs(["man", "moon", "main"]) → {"m": "n"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("m", "n");
        String [] words = {"man", "moon", "main"};
        Map<String, String> map2 = Map2.pairs_christivie(words);
        for(Map.Entry<String, String> entry: map1.entrySet()){
            String k1 = entry.getKey();
            String expected1 = entry.getValue();
            String actual1 = map2.get(k1);
            assertEquals(expected1, actual1);
        }
        // pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
        Map<String, String> map3 = new HashMap<>();
        map3.put("g", "d");
        map3.put("m", "n");
        map3.put("n", "t");
        String [] words1 = {"man", "moon", "good", "night"};
        Map<String, String> map4 = Map2.pairs_christivie(words1);
        for(Map.Entry<String, String> entry: map3.entrySet()){
            String k2 = entry.getKey();
            String expected2 = entry.getValue();
            String actual2= map4.get(k2);
            assertEquals(expected2, actual2);
        }
    }
}