package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_ryalieTest {

    @Test

    public void wordMultiple_ryalie() {
        // tests with an array with duplicate words
        String[] str1 = {"apple", "banana", "apple", "kiwi"};
        Map<String, Boolean> result1 = Map2Test_ryalie.wordMultiple_ryalie(str1);
        assertEquals(true, result1.get("apple"));
        assertEquals(false, result1.get("banana"));
        assertEquals(false, result1.get("kiwi"));

        //tests with an array with no duplicate words
        String[] str2 = {"coconut", "durian", "elderberry"};
        Map<String, Boolean> result2 = Map2Test_ryalie.wordMultiple_ryalie(str2);
        assertEquals(false, result2.get("coconut"));
        assertEquals(false, result2.get("durian"));
        assertEquals(false, result2.get("elderberry"));
    }

}