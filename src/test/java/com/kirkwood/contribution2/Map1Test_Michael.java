package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Michael {

    @Test
    void topping3_michael() {
        Map<String, String> mapA = new HashMap<>();
        mapA.put("potato", "ketchup");


        Map<String, String> mapB = new HashMap<>();
        mapB.put("potato", "ketchup");
        mapB.put("fries", "ketchup");

        assertEquals(mapB, Map1.topping3_michael(mapA));
    }
}