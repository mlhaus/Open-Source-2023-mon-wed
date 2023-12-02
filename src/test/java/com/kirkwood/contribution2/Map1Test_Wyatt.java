package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Map1Test_Wyatt {

    @Test
    void mapAB_Wyatt() {
            // map set up
            Map<String, String> startMap = new HashMap<>();
            Map<String, String> expectedMap = new HashMap<>();


            // assertion 1
            startMap.put("a", "Hi");
            startMap.put("b", "There");
            expectedMap.put("a", "Hi");
            expectedMap.put("b", "There");
            expectedMap.put("ab", "HiThere");
            Map<String, String> actualMap = Map1.mapAB_Wyatt(startMap);
            assertEquals(actualMap, expectedMap);



            // assertion 2
            startMap.clear();
            expectedMap.clear();
            actualMap.clear();
            startMap.put("a", "Hi");
            expectedMap.put("a", "Hi");
            actualMap = Map1.mapAB_Wyatt(startMap);
            assertEquals(expectedMap, actualMap);


            // assertion 3
            startMap.clear();
            expectedMap.clear();
            actualMap.clear();
            startMap.put("b", "There");
            expectedMap.put("b", "There");
            actualMap = Map1.mapAB_Wyatt(startMap);
            assertEquals(expectedMap, actualMap);

            // assertion 4
            startMap.clear();
            expectedMap.clear();
            actualMap.clear();
            startMap.put("c", "meh");
            expectedMap.put("c", "meh");
            actualMap = Map1.mapAB_Wyatt(startMap);
            assertEquals(expectedMap, actualMap);


            // assertion 5
            startMap.clear();
            expectedMap.clear();
            actualMap.clear();
            startMap.put("a", "aaa");
            startMap.put("ab", "nope");
            startMap.put("b", "bbb");
            startMap.put("c", "ccc");
            expectedMap.put("a", "aaa");
            expectedMap.put("ab", "aaabbb");
            expectedMap.put("b", "bbb");
            expectedMap.put("c", "ccc");
            actualMap = Map1.mapAB_Wyatt(startMap);
            assertEquals(expectedMap, actualMap);


            // assertion 6
            startMap.clear();
            expectedMap.clear();
            actualMap.clear();
            startMap.put("ab", "nope");
            startMap.put("b", "bbb");
            startMap.put("c", "ccc");
            expectedMap.put("ab", "nope");
            expectedMap.put("b", "bbb");
            expectedMap.put("c", "ccc");
            actualMap = Map1.mapAB_Wyatt(startMap);
            assertEquals(expectedMap, actualMap);
    }
}