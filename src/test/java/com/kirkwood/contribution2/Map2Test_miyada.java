package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_miyada {

    @Test
    void wordLen_miyada() {
        //wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
        String[] arr = {"a", "bb", "a", "bb"};

        Map<String, Integer> map = Map2.wordLen_miyada(arr);
        assertEquals(2, map.get("bb"));
        assertEquals(1, map.get("a"));

        map.clear();

        //wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
        String[] arr2 = {"this", "and", "that", "and"};

        Map<String, Integer> map2 = Map2.wordLen_miyada(arr2);
        assertEquals(4, map2.get("that"));
        assertEquals(3, map2.get("and"));
        assertEquals(4, map2.get("this"));
        map.clear();
        //wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
        String[] arr3 = {"code", "code", "code", "bug"};

        Map<String, Integer> map3 = Map2.wordLen_miyada(arr3);
        assertEquals(4, map3.get("code"));
        assertEquals(3, map3.get("bug"));

        map.clear();
    }

}