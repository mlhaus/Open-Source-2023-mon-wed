package com.kirkwood.contribution2;

import com.kirkwood.contribution2.Map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Map1Test_Chris {

  @Test
  public void mapAB4_chris() {
    Map<String, String> map = new HashMap<>();
    Map<String, String> map2 = new HashMap<>();
    map.put("a","aaa");
    map.put("b","bb");
    map.put("c","cake");

    map2 = Map1.mapAB4_chris(map);
    assertEquals("aaa", map2.get("a"));
    assertEquals("bb", map2.get("b"));
    assertEquals("aaa", map2.get("c"));

    map.clear();
    map.put("a","aa");
    map.put("b","bbb");
    map.put("c","cake");

    map2 = Map1.mapAB4_chris(map);
    assertEquals("aa", map2.get("a"));
    assertEquals("bbb", map2.get("b"));
    assertEquals("bbb", map2.get("c"));

    map.clear();
    map.put("a","aa");
    map.put("b","bbb");

    map2 = Map1.mapAB4_chris(map);
    assertEquals("aa", map2.get("a"));
    assertEquals("bbb", map2.get("b"));
    assertEquals("bbb", map2.get("c"));

    map.clear();
    map.put("a","aaa");

    map2 = Map1.mapAB4_chris(map);
    assertEquals("aaa", map2.get("a"));

    map.clear();
    map.put("b","bbb");

    map2 = Map1.mapAB4_chris(map);
    assertEquals("bbb", map2.get("b"));


    map.clear();
    map.put("a","a");
    map.put("b","b");
    map.put("c","cake");

    map2 = Map1.mapAB4_chris(map);
    assertEquals("", map2.get("a"));
    assertEquals("", map2.get("b"));
    assertEquals("cake", map2.get("c"));

  }
}