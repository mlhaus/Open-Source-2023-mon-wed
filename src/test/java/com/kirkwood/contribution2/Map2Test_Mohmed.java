package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Mohmed {

    @Test
    void wordLen_mohmed() {
        String[] arr = {"a", "bb", "a", "bb"};
        Map<String,Integer> map = Map2.wordLen_mohmed(arr);
        assertEquals(1,map.get("a"));
        assertEquals(2,map.get("bb"));

        map.clear();

        String[] arr2 = {"this", "and", "that", "and"};
        map = Map2.wordLen_mohmed(arr2);
        assertEquals(4,map.get("this"));
        assertEquals(3,map.get("and"));
        assertEquals(4,map.get("this"));

        map.clear();

        String[] arr3 = {"code", "code", "code", "bug"};
        map = Map2.wordLen_mohmed(arr3);
        assertEquals(4,map.get("code"));
        assertEquals(3,map.get("bug"));

        map.clear();

        String[] arr4 = {""};
        map = Map2.wordLen_mohmed(arr4);
        assertEquals(0,map.get(""));

        map.clear();

        String[] arr5 = {"z"};
        map = Map2.wordLen_mohmed(arr5);
        assertEquals(1,map.get("z"));

        map.clear();

        String[] arr6 = {"count the string", "or", "word_len"};
        map = Map2.wordLen_mohmed(arr6);
        assertEquals(16,map.get("count the string"));
        assertEquals(2,map.get("or"));
        assertEquals(8,map.get("word_len"));

    }
}