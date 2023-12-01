package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Wyatt {


    @Test
    void pairs_Wyatt() {
        // initializations
        String[] startingStrings = new String[10];
        Map<String, String> expectedMap = new HashMap<>();

        // Test 1
        startingStrings[0] = "code";
        startingStrings[1] = "bug";
        expectedMap.put("b", "g");
        expectedMap.put("c", "e");
        Map<String, String> actualMap = Map2.pairs_Wyatt(startingStrings);
        assertEquals(actualMap, expectedMap);

        // Test 2
        expectedMap.clear();
        actualMap.clear();
        startingStrings[0] = "man";
        startingStrings[1] = "moon";
        startingStrings[2] = "main";
        expectedMap.put("m", "n");
        actualMap.put("m", "n");
        assertEquals(expectedMap, actualMap);
    }
}