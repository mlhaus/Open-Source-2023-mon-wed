package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Darryl {
    @Test
    void wordAppend_Darryl(){
        String[] arr1 = {"a", "b", "a"};
        String result1 = Map2.wordAppend_Darryl(arr1);
        assertEquals("a", result1);

        String[] arr2 = {"a", "b", "a", "c", "a", "d", "a"};
        String result2 = Map2.wordAppend_Darryl(arr2);
        assertEquals("aa", result2);

        String[] arr3 = {"a", "", "a"};
        String result3 = Map2.wordAppend_Darryl(arr3);
        assertEquals("a", result3);

        String[] arr4 = {""};
        String result4 = Map2.wordAppend_Darryl(arr4);
        assertEquals("", result4);

        String[] arr5 = {"a", "b", "b", "a", "a"};
        String result5 = Map2.wordAppend_Darryl(arr5);
        assertEquals("ba", result5);

        String[] arr6 = {"a", "b", "b", "b", "a", "c", "a", "a"};
        String result6 = Map2.wordAppend_Darryl(arr6);
        assertEquals("baa", result6);

        String[] arr7 = {"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"};
        String result7 = Map2.wordAppend_Darryl(arr7);
        assertEquals("baaba", result7);

        String[] arr8 = {"not", "and", "or", "and", "this", "and", "or", "that", "not"};
        String result8 = Map2.wordAppend_Darryl(arr8);
        assertEquals("andornot", result8);

        String[] arr9 = {"a", "b", "c"};
        String result9 = Map2.wordAppend_Darryl(arr9);
        assertEquals("", result9);

        String[] arr10 = {"this", "or", "that", "and", "this", "and", "that"};
        String result10 = Map2.wordAppend_Darryl(arr10);
        assertEquals("thisandthat", result10);

        String[] arr11 = {"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"};
        String result11 = Map2.wordAppend_Darryl(arr11);
        assertEquals("xxyyzzxx", result11);


    }
}