package com.kirkwood.contribution2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Mitchell {
/*
"this", "or", "that", "and", "this", "and", "that"

"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"
 */
    @Test
    void wordAppend_MitchellStirmel1() {
        String[] strings = {"a","b","a"};
        String expectedString = "a";

        String actualString = Map2.wordAppend_MitchellStirmel(strings);

        Assertions.assertEquals(expectedString, actualString);
    }
    @Test
    void wordAppend_MitchellStirmel2() {
        String[] strings = {"a", "b", "a", "c", "a", "d", "a"};
        String expectedString = "aa";

        String actualString = Map2.wordAppend_MitchellStirmel(strings);

        Assertions.assertEquals(expectedString, actualString);
    }
    @Test
    void wordAppend_MitchellStirmel3() {
        String[] strings = {"a","","a"};
        String expectedString = "a";

        String actualString = Map2.wordAppend_MitchellStirmel(strings);

        Assertions.assertEquals(expectedString, actualString);
    }
    @Test
    void wordAppend_MitchellStirmel4() {
        String[] strings = {};
        String expectedString = "";

        String actualString = Map2.wordAppend_MitchellStirmel(strings);

        Assertions.assertEquals(expectedString, actualString);
    }
    @Test
    void wordAppend_MitchellStirmel5() {
        String[] strings = {"a", "b", "b", "a", "a"};
        String expectedString = "ba";

        String actualString = Map2.wordAppend_MitchellStirmel(strings);

        Assertions.assertEquals(expectedString, actualString);
    }
    @Test
    void wordAppend_MitchellStirmel6() {
        String[] strings = {"a", "b", "b", "b", "a", "c", "a", "a"};
        String expectedString = "baa";

        String actualString = Map2.wordAppend_MitchellStirmel(strings);

        Assertions.assertEquals(expectedString, actualString);
    }
    @Test
    void wordAppend_MitchellStirmel7() {
        String[] strings = {"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"};
        String expectedString = "baaba";

        String actualString = Map2.wordAppend_MitchellStirmel(strings);

        Assertions.assertEquals(expectedString, actualString);
    }
    @Test
    void wordAppend_MitchellStirmel8() {
        String[] strings = {"not", "and", "or", "and", "this", "and", "or", "that", "not"};
        String expectedString = "andornot";

        String actualString = Map2.wordAppend_MitchellStirmel(strings);

        Assertions.assertEquals(expectedString, actualString);
    }
    @Test
    void wordAppend_MitchellStirmel9() {
        String[] strings = {"a","b","c"};
        String expectedString = "";

        String actualString = Map2.wordAppend_MitchellStirmel(strings);

        Assertions.assertEquals(expectedString, actualString);
    }
    @Test
    void wordAppend_MitchellStirmel10() {
        String[] strings = {"this", "or", "that", "and", "this", "and", "that"};
        String expectedString = "thisandthat";

        String actualString = Map2.wordAppend_MitchellStirmel(strings);

        Assertions.assertEquals(expectedString, actualString);
    }
    @Test
    void wordAppend_MitchellStirmel11() {
        String[] strings = {"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"};
        String expectedString = "xxyyzzxx";

        String actualString = Map2.wordAppend_MitchellStirmel(strings);

        Assertions.assertEquals(expectedString, actualString);
    }
}