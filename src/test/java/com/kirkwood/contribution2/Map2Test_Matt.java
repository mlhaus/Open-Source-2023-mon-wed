package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Matt {

    @Test
    public void wordMultiple_Matthew_Baccam() {
        String[] wordMultiple1 = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> map1 = Map2.wordMultiple_Matthew_Baccam(wordMultiple1);
        assertEquals(true, map1.get("a"));
        assertEquals(true, map1.get("b"));
        assertEquals(false, map1.get("c"));

        String[] wordMultiple2 = {"c", "b", "a"};
        Map<String, Boolean> map2 = Map2.wordMultiple_Matthew_Baccam(wordMultiple2);
        assertEquals(false, map2.get("a"));
        assertEquals(false, map2.get("b"));
        assertEquals(false, map2.get("b"));



        String[] wordMultiple3 = {"c", "c", "c", "c"};
        Map<String, Boolean> map3 = Map2.wordMultiple_Matthew_Baccam(wordMultiple3);
        assertEquals(true, map3.get("c"));



    }
}