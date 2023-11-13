package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test {

    @Test
    void pairs_JacobRohr() {
        String[] strings = {"code", "bug"};
        Map<String, String> map = Map2.pairs_JacobRohr(strings);
        assertEquals(true, map.containsKey("b"));
        assertEquals(true, map.containsKey("c"));
        assertEquals("g", map.get("b"));
        assertEquals("e", map.get("c"));

        String[] strings2 = {"man", "moon", "main"};
        map = Map2.pairs_JacobRohr(strings2);
        assertEquals(true, map.containsKey("m"));
        assertEquals("n", map.get("m"));

        String[] strings3 = {"man", "moon", "good", "night"};
        map = Map2.pairs_JacobRohr(strings3);
        assertEquals(true, map.containsKey("g"));
        assertEquals(true, map.containsKey("m"));
        assertEquals(true, map.containsKey("n"));
        assertEquals("d", map.get("g"));
        assertEquals("n", map.get("m"));
        assertEquals("t", map.get("n"));





    }
}