package com.kirkwood.contribution2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
  
 public static Map<String, Integer> wordLen_Akoi(String[] strings) {
    Map<String, Integer> map = new HashMap();
    for (String s:strings) {
        map.put(s, s.length());
    }
    return map;
  }

    public static Map<String, Integer> wordLen_anthonytalamantes(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : strings) {
            result.put(str, str.length());
        }
        return result;
    }

    public static Map<String, Integer> wordLen_julien(String[] strings) {
        Map<String, Integer> counter = new HashMap<>();
        for (String str: strings) {
            if (!counter.containsKey(str)) {
                counter.put(str, str.length());
            }
        }
        return counter;
    }

    public static Map<String, Boolean> wordMultiple_ryalie(String[] strings) {
        Map<String, Integer> counter = new HashMap<>();
        for(String str: strings) {
            if(!counter.containsKey(str)) {
                counter.put(str, 1);
            } else {
                counter.put(str, counter.get(str) + 1);
            }
        }
        Map<String, Boolean> map = new HashMap<>();
        for(String key: counter.keySet()) {
            if(counter.get(key) >= 2) {
                map.put(key, true);
            } else {
                map.put(key, false);
            }
        }
        return map;
    }

    public static Map<String, Integer> wordLen_mohmed(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            result.put(str, str.length());
        }
        return result;
    }

    public static Map<String, String> pairs_Wyatt(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String string : strings){
            map.put(String.valueOf(string.charAt(0)), String.valueOf(string.charAt(string.length() - 1)));
        }
        return map;
    }
          

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

  public String[] allSwap_chris(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    for(int i = 0; i < strings.length; i++){
      if (!map.containsKey(Character.toString(strings[i].charAt(0)))){
        map.put(Character.toString(strings[i].charAt(0)), i);
      } else {
        String temp = strings[i];
        strings[i] = strings[map.get(Character.toString(strings[i].charAt(0)))];
        strings[map.get(Character.toString(strings[i].charAt(0)))] = temp;
        map.remove(Character.toString(strings[i].charAt(0)));
      }
    }
    return strings;
  }

    public static Map<String, Integer> wordLen_kate(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String str: strings) {
            if(!map.containsKey(str)) {
                map.put(str, str.length());
            }
        }
        return map;
    }

    public static Map<String, Integer> wordLen_BenCollins(String[] strings) {
        Map<String, Integer> counter = new HashMap<>();
        for(String element : strings) {
            if(!counter.containsKey(element)) {
                counter.put(element, element.length());
            }
        }
        return counter;
    }


    public static Map<String, Integer> wordLen_everett(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String str :strings) {
            map.put(str, str.length());
        }
        return map;
    }

    public static Map<String, Integer> Jennifer_wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String str: strings) {
            if(!map.containsKey(str)){
                map.put(str, str.length());
            }
        }
        return map;
    }
  
    public static String wordAppend_Darryl(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";
        for(int i = 0; i < strings.length; i++){
            if(map.containsKey(strings[i])){
                map.put(strings[i], map.get(strings[i]) +1);
                if((map.get(strings[i]) % 2) == 0){
                    result+= strings[i];
                }
            }
            else{
                map.put(strings[i], 1);
            }

        }
        return result;
    }

    public static String[] allSwap_jared(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++) {
            String currentChar = strings[i].substring(0,1);
            if(map.containsKey(currentChar)) {
                String temp = strings[i];
                strings[i] = strings[map.get(currentChar)];
                strings[map.get(currentChar)] = temp;
                map.remove(currentChar);
            } else {
                map.put(currentChar, i);
            }
        }
        return strings;
    }


    public Map<String, String> pairs_andrew(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String str: strings) {
            map.put(str.substring(0, 1), str.substring(str.length()-1, str.length()));
        }
        return map;
    }

    public static Map<String, String> pairs_tyler(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < strings.length; i++) {
            String tmp = strings[i];
            String first = String.valueOf(tmp.charAt(0));
            String last = String.valueOf(tmp.charAt(tmp.length() - 1));
            map.put(first, last);
        }
        return map;
    }

}
