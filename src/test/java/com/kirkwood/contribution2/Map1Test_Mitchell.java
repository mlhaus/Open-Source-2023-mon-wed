package com.kirkwood.contribution2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Mitchell {
// 1 test was removed since it tested the same thing as another test
    @Test
    void mapAB4_MitchellStirmel2() {
        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("a", "aaa");
        expectedMap.put("b", "bb");
        expectedMap.put("c", "aaa");

        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("a", "aaa");
        inputMap.put("b", "bb");
        inputMap.put("c", "cake");

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
    @Test
    void mapAB4_MitchellStirmel3() {
        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("a", "aa");
        expectedMap.put("b", "bbb");
        expectedMap.put("c", "bbb");

        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("a", "aa");
        inputMap.put("b", "bbb");
        inputMap.put("c", "cake");

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
    @Test
    void mapAB4_MitchellStirmel4() {
        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("a", "aaa");

        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("a", "aaa");

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
    @Test
    void mapAB4_MitchellStirmel5() {
        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("b", "bbb");

        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("b", "bbb");

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
    @Test
    void mapAB4_MitchellStirmel6() {
        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("a", "");
        expectedMap.put("b", "");
        expectedMap.put("c", "cake");

        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("a", "aaa");
        inputMap.put("b", "bbb");
        inputMap.put("c", "cake");

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
    @Test
    void mapAB4_MitchellStirmel7() {
        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("a", "");
        expectedMap.put("b", "");
        expectedMap.put("c", "cake");

        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("a", "aaa");
        inputMap.put("b", "bbb");
        inputMap.put("c", "cake");

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
    @Test
    void mapAB4_MitchellStirmel8() {
        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("a", "");
        expectedMap.put("b", "b");
        expectedMap.put("c", "b");

        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("a", "");
        inputMap.put("b", "b");
        inputMap.put("c", "cake");

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
    @Test
    void mapAB4_MitchellStirmel9() {
        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("a", "a");
        expectedMap.put("b", "");
        expectedMap.put("c", "a");

        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("a", "a");
        inputMap.put("b", "");
        inputMap.put("c", "cake");

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
    @Test
    void mapAB4_MitchellStirmel10() {
        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("c", "cat");
        expectedMap.put("d", "dog");

        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("c", "cat");
        inputMap.put("d", "dog");

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
    @Test
    void mapAB4_MitchellStirmel11() {
        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("ccc", "ccc");

        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("ccc", "ccc");

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
    @Test
    void mapAB4_MitchellStirmel12() {
        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("c", "a");
        expectedMap.put("d", "b");

        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("c", "a");
        inputMap.put("d", "b");

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
    @Test
    void mapAB4_MitchellStirmel13() {
        Map<String,String> expectedMap = new HashMap<>();

        Map<String,String> inputMap = new HashMap<>();

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
    @Test
    void mapAB4_MitchellStirmel14() {
        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("a", "");
        expectedMap.put("z", "z");

        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("a", "");
        inputMap.put("z", "z");

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
    @Test
    void mapAB4_MitchellStirmel15() {
        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("b", "");
        expectedMap.put("z", "z");

        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("b", "");
        inputMap.put("z", "z");

        Map<String,String> actualMap = Map1.mapAB4_MitchellStirmel(inputMap);
        Assertions.assertEquals(expectedMap,actualMap);
    }
}