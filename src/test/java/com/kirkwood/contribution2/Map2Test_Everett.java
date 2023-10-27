package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Everett {

    @Test
    void wordLen_everett1() {
    // wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
        String[] String = {"a", "bb", "a", "bb"};
        Map<String, Integer> map = Map2.wordLen_everett(String);
        assertEquals(2, map.get("bb"));
        assertEquals(1, map.get("a"));
    }

    @Test
    void wordLen_everett2() {
        // wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
        String[] String = {"this", "and", "that", "and"};
        Map<String, Integer> map = Map2.wordLen_everett(String);
        assertEquals(4, map.get("that"));
        assertEquals(3, map.get("and"));
        assertEquals(4, map.get("this"));
    }

    @Test
    void wordLen_everett3() {
        // wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
        String[] String = {"code", "code", "code", "bug"};
        Map<String, Integer> map = Map2.wordLen_everett(String);
        assertEquals(4, map.get("code"));
        assertEquals(3, map.get("bug"));
    }

    @Test
    void wordLen_everett4() {
        // wordLen([]) → {}
        String[] string = {};
        Map<String, Integer> map = Map2.wordLen_everett(string);
        assertEquals(null, map.get(""));
    }
}