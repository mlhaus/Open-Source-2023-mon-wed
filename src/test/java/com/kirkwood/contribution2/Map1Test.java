package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test {

    @Test
    void topping3_JacobRohr() {
        Map<String, String> map = new HashMap<>();
        map.put("potato", "ketchup");
        Map<String, String> map2 =Map1.topping3_JacobRohr(map);
        assertEquals("ketchup", map2.get("potato"));
        assertEquals("ketchup", map2.get("fries"));

        map.put("potato", "butter");
        map2 = Map1.topping3_JacobRohr(map);
        assertEquals("butter",map2.get("potato"));
        assertEquals("butter",map2.get("fries"));

        map.put("salad", "oil");
        map.put("potato","ketchup");
        map2 = Map1.topping3_JacobRohr(map);
        assertEquals("oil",map2.get("spinach"));
        assertEquals("oil",map2.get("salad"));
        assertEquals("ketchup",map2.get("potato"));
        assertEquals("ketchup",map2.get("fries"));




    }
}