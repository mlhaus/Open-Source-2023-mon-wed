package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Michael {
    Map<String, String> mapA = new HashMap<>();
    Map<String, String> mapB = new HashMap<>();
    @Test
    void topping3_michael_potatoValue1() {
        mapA.clear();
        mapB.clear();
        mapA.put("potato", "ketchup");
        mapB.put("potato", "ketchup");
        mapB.put("fries", "ketchup");

        assertEquals(mapB, Map1.topping3_michael(mapA));
    }
    @Test
    void topping3_michael_potatoValue2(){
        mapA.clear();
        mapB.clear();
        mapA.put("potato", "butter");
        mapB.put("potato", "butter");
        mapB.put("fries", "butter");

        assertEquals(mapB, Map1.topping3_michael(mapA));
    }
    @Test
    void topping3_michael_potatoValueAndSaladKey(){
        mapA.clear();
        mapB.clear();
        mapA.put("salad", "oil");
        mapA.put("potato", "ketchup");
        mapB.put("spinach", "oil");
        mapB.put("salad", "oil");
        mapB.put("potato", "ketchup");
        mapB.put("fries", "ketchup");

        assertEquals(mapB, Map1.topping3_michael(mapA));
    }
    @Test
    void topping3_michael_unchangedValue(){
        mapA.put("toast", "butter");
        mapB.put("toast", "butter");

        assertEquals(mapB, Map1.topping3_michael(mapA));

    }

    @Test
    void topping3_michael_emptyMap(){
        Map<String, String> mapC = new HashMap<>();

        assertEquals(mapC, Map1.topping3_michael(mapC));
    }

    @Test
    void topping3_michael_test6(){
        mapA.clear();
        mapB.clear();

        mapA.put("salad", "pepper");
        mapA.put("fries", "salt");
        mapB.put("spinach", "pepper");
        mapB.put("salad", "pepper");
        mapB.put("fries", "salt");

        assertEquals(mapB, Map1.topping3_michael(mapA));
    }
}