package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Julien {

    @Test
    void wordLen_julien() {
        String[] arr1 = {"this", "and", "that", "and"};
        Map<String, Integer> map1 = Map2.wordLen_julien(arr1);
        assertEquals(4, map1.get("this"));
        assertEquals(3, map1.get("and"));
        assertEquals(4, map1.get("that"));

        String[] arr2 = {"code", "code", "code", "bug"};
        Map<String, Integer> map2 = Map2.wordLen_julien(arr2);
        assertEquals(4, map2.get("code"));
        assertEquals(3, map2.get("bug"));

        String[] arr3 = {};
        Map<String, Integer> map3 = Map2.wordLen_julien(arr3);
        assertNull(map3.get(""));

        String[] arr4 = {"z"};
        Map<String, Integer> map4 = Map2.wordLen_julien(arr4);
        assertEquals(1, map4.get("z"));
    }
}