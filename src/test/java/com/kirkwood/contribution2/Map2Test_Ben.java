package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Ben {

    @Test
    void wordLen_BenCollins() {
        // wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
        String[] strings = {"a","bb", "a", "bb"};
        Map<String, Integer> map = Map2.wordLen_BenCollins(strings);
        assertEquals(2, map.get("bb"));
        assertEquals(1, map.get("a"));
    }

    @Test
    void wordLen_BenCollins_2() {
        // wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
        String[] strings = {"this","and", "that", "and"};
        Map<String, Integer> map = Map2.wordLen_BenCollins(strings);
        assertEquals(4, map.get("that"));
        assertEquals(3, map.get("and"));
        assertEquals(4, map.get("this"));
    }

    @Test
    void wordLen_BenCollins_3() {
        // wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
        String[] strings = {"code", "code", "code", "bug"};
        Map<String, Integer> map = Map2.wordLen_BenCollins(strings);
        assertEquals(4, map.get("code"));
        assertEquals(3, map.get("bug"));
    }

    @Test
    void wordLen_BenCollins_4() {
        // wordLen([]) → {}
        String[] strings = {};
        Map<String, Integer> map = Map2.wordLen_BenCollins(strings);
        assertEquals(null, map.get(""));
    }

    @Test
    void wordLen_BenCollins_5() {
        // wordLen(["z"]) → {"z": 1}
        String[] strings = {"z"};
        Map<String, Integer> map = Map2.wordLen_BenCollins(strings);
        assertEquals(1, map.get("z"));
    }
}