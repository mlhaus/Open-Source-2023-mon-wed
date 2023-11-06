package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Map1Test_gishe {
    @Test
    public void mapBully_gishe() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        Map<String, String> expected = new HashMap<>();
        expected.put("a", "");
        expected.put("b", "candy");
        assertEquals(expected, Map1.mapBully_gishe(map));
    }
}
