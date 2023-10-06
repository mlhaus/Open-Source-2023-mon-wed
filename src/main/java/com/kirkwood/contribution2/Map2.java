package com.kirkwood.contribution2;

public class Map2 {
    public Map<String, String> firstChar_james(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String word : strings) {
            String firstLetter = String.valueOf(word.charAt(0));
            if(!map.containsKey(firstLetter)) {
                map.put(firstLetter, word);
            } else {
                map.put(firstLetter, map.get(firstLetter) + word);
            }
        } return map;
    }
}
