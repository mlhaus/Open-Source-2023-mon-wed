package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Tyler {

    @Test
    void pairs_tyler() {
        //1
        String[] strings = {"code", "bug"};
        Map<String, String> output = Map2.pairs_tyler(strings);
        assertEquals("g", output.get("b"));
        assertEquals("e", output.get("c"));

        //2
        String[] strings1 = {"man", "moon", "main"};
        Map<String, String> output1 = Map2.pairs_tyler(strings1);
        assertEquals("n", output1.get("m"));

        //3
        String[] strings2 = {"man", "moon", "good", "night"};
        Map<String, String> output2 = Map2.pairs_tyler(strings2);
        assertEquals("d", output2.get("g"));
        assertEquals("n", output2.get("m"));
        assertEquals("t", output2.get("n"));

        // this is the second one
    }
}