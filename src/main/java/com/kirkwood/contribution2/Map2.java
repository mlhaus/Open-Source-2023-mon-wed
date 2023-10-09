package com.kirkwood.contribution2;

static class Map2 <String, Integer> wordLen_Akoi(String[] strings) {
    Map<String, Integer> map = new HashMap();
    for (String s:strings) {
        map.put(s, s.length());
    }
    return map;
}
