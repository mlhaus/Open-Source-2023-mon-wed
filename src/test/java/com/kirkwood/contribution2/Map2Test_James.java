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
    }
}