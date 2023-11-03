package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Anthony {

    @Test
    void wordLen_anthonytalamantes() {
        String[] word1 = {"a", "bb", "a", "bb"};
        Map<String, Integer> map = Map2.wordLen_anthonytalamantes(word1);
        assertEquals(2,map.get("bb"));
        assertEquals(1,map.get("a"));

        String[] word2 = {"this", "and", "that", "and"};
        Map<String, Integer> map2 = Map2.wordLen_anthonytalamantes(word2);
        assertEquals(4,map2.get("that"));
        assertEquals(3,map2.get("and"));
        assertEquals(4,map2.get("this"));

        String[] word3 = {"code", "code", "code", "bug"};
        Map<String, Integer> map3 = Map2.wordLen_anthonytalamantes(word3);
        assertEquals(4,map3.get("code"));
        assertEquals(3,map3.get("bug"));
    }
}