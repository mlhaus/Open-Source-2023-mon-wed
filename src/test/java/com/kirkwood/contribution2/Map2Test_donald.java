package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class Map2Test_donald {

    @Test
    public static Map<String, Integer> wordCount_donald(String[] strings) {
            Map<String, Integer> counter = new HashMap<>();
            for(String str: strings) {
                if(!counter.containsKey(str)) {
                    counter.put(str, 1);
                } else {
                    counter.put(str, counter.get(str) + 1);
                }
            }
            return counter;
        }
}
