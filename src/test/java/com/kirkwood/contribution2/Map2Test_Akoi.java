package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Akoi {

    @Test
    void wordLen_Akoi() {
//        wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
        String[] strings = {"a", "bb", "a", "bb"};
        Map<String, Integer> map3 = Map2.wordLen_Akoi(strings);
        assertEquals(2, map3.get("bb"));
        assertEquals(1, map3.get("a"));

        String[] strings1 = {"this", "and", "that", "and"};
        Map<String, Integer> map4 = Map2.wordLen_Akoi(strings1);
        assertEquals(4, map4.get("that"));
        assertEquals(3, map4.get("and"));
        assertEquals(4, map4.get("this"));

        String[] strings2 = {"code", "code", "code", "bug"};
        Map<String, Integer> map5 = Map2.wordLen_Akoi(strings2);
        assertEquals(4, map5.get("code"));
        assertEquals(3, map5.get("bug"));

    }
}