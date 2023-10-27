package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Matt {

    @Test
    public void mapAB4_Matthew_Baccam(){
        Map<String, String> mapTest1 = new HashMap<>();
        mapTest1.put("a", "aaa");
        mapTest1.put("b", "bb");
        mapTest1.put("c", "cake");
        Map<String, String> output1 = Map1.mapAB4_Matthew_Baccam(mapTest1);
        assertEquals("aaa", output1.get("a"));
        assertEquals("bb", output1.get("b"));
        assertEquals("aaa", output1.get("c"));

        Map<String, String> mapTest2 = new HashMap<>();
        mapTest2.put("a", "aa");
        mapTest2.put("b", "bbb");
        mapTest2.put("c", "cake");
        Map<String, String> output2 = Map1.mapAB4_Matthew_Baccam(mapTest2);
        assertEquals("aa", output2.get("a"));
        assertEquals("bbb", output2.get("b"));
        assertEquals("bbb", output2.get("c"));

        Map<String, String> mapTest3 = new HashMap<>();
        mapTest3.put("a", "aa");
        mapTest3.put("b", "bbb");
        Map<String, String> output3 = Map1.mapAB4_Matthew_Baccam(mapTest3);
        assertEquals("aa", output3.get("a"));
        assertEquals("bbb", output3.get("b"));
        assertEquals("bbb", output3.get("c"));


    }
}