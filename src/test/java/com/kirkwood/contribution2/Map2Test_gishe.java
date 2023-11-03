package com.kirkwood.contribution2;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Map2Test_gishe {
    @Test
    public void word0_gishe() {
        String[] strings = {"a", "b", "a", "b"};

        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 0);
        expected.put("b", 0);
        assertEquals(expected, Map2.word0_gishe(strings));
        expected = new HashMap<>();
        expected.put("a", 0);
        expected.put("b", 0);
        assertEquals(expected, Map2.word0_gishe(strings));

    }
}
