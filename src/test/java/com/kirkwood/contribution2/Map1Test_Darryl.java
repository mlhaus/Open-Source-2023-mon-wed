package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
class Map1Test_Darryl {
  @Test
  void mapAB2_Darryl(){
    Map<String, String> map = new HashMap<>();
    map.put("a", "aaa");
    map.put("b" ,"aaa");
    map.put("c", "cake");
    Map<String, String> map2 =  Map1.mapAB2_Darryl(map);
    assertEquals("cake", map2.get("c"));


    Map<String, String> map_1 = new HashMap<>();
    map_1.put("a", "aaa");
    map_1.put("b", "bbb");
    Map<String, String> map_2 = Map1.mapAB2_Darryl(map_1);
    assertEquals(map_1, map_2);

    Map<String, String> map_01 = new HashMap<>();
    map_01.put("a", "aaa");
    map_01.put("b", "bbb");
    map_01.put("c", "aaa");
    Map<String, String> map_02 = Map1.mapAB2_Darryl(map_01);
    assertEquals(map_01, map_02);

    Map<String, String> map_001 = new HashMap<>();
    map_001.put("a", "aaa");
    Map<String, String> map_002 = Map1.mapAB2_Darryl(map_001);
    assertEquals(map_001, map_002);

    Map<String, String> map_0001 = new HashMap<>();
    map_0001.put("b", "bbb");
    Map<String, String> map_0002 = Map1.mapAB2_Darryl(map_0001);
    assertEquals(map_0001, map_0002);

    Map<String, String> map_00001 = new HashMap<>();
    map_00001.put("a", "");
    map_00001.put("b", "");
    map_00001.put("c", "ccc");
    Map<String, String> map_00002 = Map1.mapAB2_Darryl(map_00001);
    assertEquals("ccc", map_00002.get("c"));

    Map<String, String> map_3 = new HashMap<>();
    Map<String, String> map_4 = Map1.mapAB2_Darryl(map_3);
    assertEquals(map_3, map_4);

    Map<String, String> map3 = new HashMap<>();
    map_00001.put("a", "a");
    map_00001.put("b", "b");
    map_00001.put("z", "zebra");
    Map<String, String> map4 = Map1.mapAB2_Darryl(map3);
    assertEquals(map3, map4);

  }
}