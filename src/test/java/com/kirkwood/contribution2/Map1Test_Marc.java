package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Marc {

    @Test
    void topping3_marc() {
        Map<String, String> map = new HashMap<>();
        map.put("potato", "ketchup");
        Map<String, String> map2 = Map1.topping3_marc(map);
        assertEquals("ketchup", map2.get("potato"));
        assertEquals("ketchup", map2.get("fries"));

        // more assertions here
    }
}