package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.kirkwood.contribution2.Map2.allSwapIbrahim;
import static org.junit.jupiter.api.Assertions.*;

class Map2Test_ibrahim {

    @Test
    void TestallSwapIbrahim1() {
        String[] str = {"ab", "ac"};
        String[] result = allSwapIbrahim(str);

        assertEquals(str, result);
    }

    @Test
    void TestallSwapIbrahim2() {
        String[] str = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] result = allSwapIbrahim(str);

        assertEquals(str, result);
    }

    @Test
    void TestallSwapIbrahim3() {
        String[] str = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        String[] result = allSwapIbrahim(str);

        assertEquals(str, result);
    }

    @Test
    void TestallSwapIbrahim4() {
        String[] str = {"ax", "bx", "cx", "ay", "cy", "aaa", "abb"};
        String[] result = allSwapIbrahim(str);

        assertEquals(str, result);
    }

    @Test
    void TestallSwapIbrahim5() {
        String[] str = {"easy", "does", "it", "every", "ice", "eaten"};
        String[] result = allSwapIbrahim(str);

        assertEquals(str, result);
    }


}