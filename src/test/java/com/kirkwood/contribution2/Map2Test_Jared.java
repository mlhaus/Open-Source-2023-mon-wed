package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Jared {

    @Test
    void allSwap_jared() {
        String[] strings = {"ab", "ac"};
        String[] strings2 = {"ab", "ac"};
        assertEquals(strings2, Map2.allSwap_jared(strings));

        String[] strings3 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] strings4 = {"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"};
        assertEquals(strings4, Map2.allSwap_jared(strings3));

        String[] strings5 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        String[] strings6 = {"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"};
        assertEquals(strings6, Map2.allSwap_jared(strings5));

        String[] strings7 = {"ax", "bx", "cx", "ay", "cy", "aaa", "abb"};
        String[] strings8 = {"ay", "bx", "cy", "ax", "cx", "abb", "aaa"};
        assertEquals(strings8, Map2.allSwap_jared(strings7));

        String[] strings9 = {"easy", "does", "it", "every", "ice", "eaten"};
        String[] strings10 = {"every", "does", "ice", "easy", "it", "eaten"};
        assertEquals(strings10, Map2.allSwap_jared(strings9));

        String[] strings11 = {"list", "of", "words", "swims", "over", "lily", "water", "wait"};
        String[] strings12 = {"lily", "over", "water", "swims", "of", "list", "words", "wait"};
        assertEquals(strings12, Map2.allSwap_jared(strings11));

        String[] strings13 = {"4", "8", "15", "16", "23", "42"};
        String[] strings14 = {"42", "8", "16", "15", "23", "4"};
        assertEquals(strings14, Map2.allSwap_jared(strings13));

        String[] strings15 = {"aaa"};
        String[] strings16 = {"aaa"};
        assertEquals(strings16, Map2.allSwap_jared(strings15));

        String[] strings17 = {};
        String[] strings18 = {};
        assertEquals(strings18, Map2.allSwap_jared(strings17));

        String[] strings19 = {"a", "b", "c", "xx", "yy", "zz"};
        String[] strings20 = {"a", "b", "c", "xx", "yy", "zz"};
        assertEquals(strings20, Map2.allSwap_jared(strings19));
    }
}