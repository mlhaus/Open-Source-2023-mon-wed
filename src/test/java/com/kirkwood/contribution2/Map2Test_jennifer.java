package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_jennifer {

    @Test
    void jennifer_wordLen() {

        Map<String, Integer> map = new HashMap<>();
        String[] arr1 = {"a", "bb", "a", "bb"};
        Map<String, Integer> map2 = Map2.Jennifer_wordLen(arr1);
        assertEquals(2, map2.get("bb"));
        assertEquals(1, map2.get("a"));

        Map<String, Integer> map3 = new HashMap<>();
        String[] arr  = {"this", "and", "that", "and"};
        Map<String, Integer> map4 = Map2.Jennifer_wordLen(arr);
        assertEquals(4,map4.get("that"));
        assertEquals(3, map4.get("and"));
        assertEquals(4, map4.get("this"));

        Map<String, Integer> map5 = new HashMap<>();
        String[] arr2 = {"code", "code", "code", "bug"};
        Map<String, Integer> map6 = Map2.Jennifer_wordLen(arr2);
        assertEquals(4, map6.get("code"));
        assertEquals(3, map6.get("bug"));

        Map<String, Integer> map7 = new HashMap<>();
        String[] arr3 = {};
        Map<String,Integer> map8 = Map2.Jennifer_wordLen(arr3);
        assertTrue(map8.isEmpty());

        Map<String, Integer> map9 = new HashMap<>();
        String[] arr4 = {"z"};
        Map<String, Integer> map10 = Map2.Jennifer_wordLen(arr4);
        assertEquals(1, map10.get("z"));
    }
}