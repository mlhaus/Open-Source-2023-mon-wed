package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.kirkwood.contribution2.Map1.mapAB4Ibrahim;
import static org.junit.jupiter.api.Assertions.*;

class Map1Test_ibrahim {

    @Test
    public void mapAB3Test1_Ibrahim(){
        Map map = new HashMap<String, String>();
        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "cake");
        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("aaa", mapAB.get("a") );
        assertEquals("bb", mapAB.get("b") );
        assertEquals("aaa", mapAB.get("c") );

    }

    @Test
    public void mapAB3Test2_Ibrahim(){
        Map map = new HashMap<String, String>();
        map.put("a", "aa");
        map.put("b", "bbb");
        map.put("c", "cake");
        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("aa", mapAB.get("a") );
        assertEquals("bbb", mapAB.get("b") );
        assertEquals("bbb", mapAB.get("c") );

    }

    @Test
    public void mapAB3Test3_Ibrahim(){
        Map map = new HashMap<String, String>();
        map.put("a", "aa");
        map.put("b", "bbb");
        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("aa", mapAB.get("a") );
        assertEquals("bbb", mapAB.get("b") );
        assertEquals("bbb", mapAB.get("c") );

    }

    @Test
    public void mapAB3Test4_Ibrahim(){
        Map map = new HashMap<String, String>();
        map.put("a", "aaa");
        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("aaa", mapAB.get("a") );

    }

    @Test
    public void mapAB3Test5_Ibrahim(){
        Map map = new HashMap<String, String>();
        map.put("b", "bbb");
        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("bbb", mapAB.get("b") );

    }

    @Test
    public void mapAB3Test6_Ibrahim() {
        Map map = new HashMap<String, String>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "cake");
        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("", mapAB.get("a"));
        assertEquals("", mapAB.get("b"));
        assertEquals("cake", mapAB.get("c"));

    }

    @Test
    public void mapAB3Test7_Ibrahim() {
        Map map = new HashMap<String, String>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "cake");
        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("", mapAB.get("a"));
        assertEquals("", mapAB.get("b"));
        assertEquals("cake", mapAB.get("c"));

    }

    @Test
    public void mapAB3Test8_Ibrahim() {
        Map map = new HashMap<String, String>();
        map.put("a", "");
        map.put("b", "b");
        map.put("c", "cake");
        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("", mapAB.get("a"));
        assertEquals("b", mapAB.get("b"));
        assertEquals("b", mapAB.get("c"));

    }

    @Test
    public void mapAB3Test9_Ibrahim() {
        Map map = new HashMap<String, String>();
        map.put("a", "a");
        map.put("b", "");
        map.put("c", "cake");
        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("a", mapAB.get("a"));
        assertEquals("", mapAB.get("b"));
        assertEquals("a", mapAB.get("c"));

    }

    @Test
    public void mapAB3Test10_Ibrahim() {
        Map map = new HashMap<String, String>();
        map.put("c", "cat");
        map.put("d", "dog");
        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("cat", mapAB.get("c"));
        assertEquals("dog", mapAB.get("d"));
    }

    @Test
    public void mapAB3Test11_Ibrahim() {
        Map map = new HashMap<String, String>();
        map.put("ccc", "ccc");

        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("ccc", mapAB.get("ccc"));



    }

    @Test
    public void mapAB3Test12_Ibrahim() {
        Map map = new HashMap<String, String>();
        map.put("c", "a");
        map.put("d", "b");

        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("a", mapAB.get("c"));
        assertEquals("b", mapAB.get("d"));

    }

    @Test
    public void mapAB3Test13_Ibrahim() {
        Map map = new HashMap<String, String>();
        Map mapAB = mapAB4Ibrahim(map);
        assertTrue(map ==  mapAB);

    }

    @Test
    public void mapAB3Test14_Ibrahim() {
        Map map = new HashMap<String, String>();
        map.put("a", "");
        map.put("z", "z");

        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("", mapAB.get("a"));
        assertEquals("z", mapAB.get("z"));

    }

    @Test
    public void mapAB3Test15_Ibrahim() {
        Map map = new HashMap<String, String>();

        map.put("b", "");
        map.put("z", "z");
        Map mapAB = mapAB4Ibrahim(map);
        assertEquals("", mapAB.get("b"));
        assertEquals("z", mapAB.get("z"));

    }
}