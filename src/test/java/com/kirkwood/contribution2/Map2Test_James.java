package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_James {

    @Test
    void firstChar_james() {
        //firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"])
        // → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
        String[] str = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        Map<String, String> map = Map2.firstChar_james(str);

        assertEquals("aaaAA", map.get("a"));
        assertEquals("bb", map.get("b"));
        assertEquals("cccCC", map.get("c"));
        assertEquals("d", map.get("d"));

        String [] str2 = {"salt", "tea", "soda", "toast"};
        Map<String, String> map2 = Map2.firstChar_james(str2);
        assertEquals("saltsoda", map2.get("s"));
        assertEquals("teatoast", map2.get("t"));

        String[] str3 = {};
        Map<String, String> map3 = Map2.firstChar_james(str3);
        assertTrue(map3.size() == 0);

        String[] str4 = {"apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"};
        Map<String, String> map4 = Map2.firstChar_james(str4);
        assertEquals("appleaardvark", map4.get("a"));
        assertEquals("bellsbellsbells", map4.get("b"));
        assertEquals("saltsun", map4.get("s"));
        assertEquals("zen", map4.get("z"));

        String[] str5 = {"aaa", "bbb", "ab"};
        Map<String, String> map5 = Map2.firstChar_james(str5);
        assertEquals("aaaab", map5.get("a"));
        assertEquals("bbb", map5.get("b"));
    }
}