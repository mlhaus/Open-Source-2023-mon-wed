package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_miyada {

    @Test
    void mapAB_Miyada() {
    }

   //mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
   @Test
   void mapAB_miyada() {

       Map<String, String> map = new HashMap<>();
       map.put("a", "Hi");
       map.put("b", "There");
       Map<String, String> map2 = Map1.mapAB_Miyada(map);
       assertEquals("Hi", map2.get("a"));
       assertEquals("HiThere", map2.get("ab"));
       assertEquals("There", map2.get("b"));
       map.clear();
       map2.clear();
       //mapAB({"a": "Hi"}) → {"a": "Hi"}

       map.put("a", "Hi");
       assertEquals("Hi", map2.get("a"));
       map.clear();
       map2.clear();
       //mapAB({"b": "There"}) → {"b": "There"}

       map.put("b", "There");
       assertEquals("There", map2.get("b"));
       map.clear();
       map2.clear();
   }
}
