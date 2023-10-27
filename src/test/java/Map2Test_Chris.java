import com.kirkwood.contribution2.Map2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Chris {

  @Test
  void allSwap_chris() {
    String[] string;

//    allSwap(["ab", "ac"]) → ["ac", "ab"]
    string = new String[]{"ab", "ac"};
    Map2.allSwap_chris(string);
    assertEquals("ac", string[0]);
    assertEquals("ab", string[1]);
    assertEquals(2, string.length);

//    allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) →
//    ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
    string = new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
    Map2.allSwap_chris(string);
    assertEquals("ay", string[0]);
    assertEquals("by", string[1]);
    assertEquals("cy", string[2]);
    assertEquals("cx", string[3]);
    assertEquals("bx", string[4]);
    assertEquals("ax", string[5]);
    assertEquals("azz", string[6]);
    assertEquals("aaa", string[7]);
    assertEquals(8, string.length);

//    allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) →
//    ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
    string = new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
    Map2.allSwap_chris(string);
    assertEquals("ay", string[0]);
    assertEquals("by", string[1]);
    assertEquals("ax", string[2]);
    assertEquals("bx", string[3]);
    assertEquals("aj", string[4]);
    assertEquals("ai", string[5]);
    assertEquals("by", string[6]);
    assertEquals("bx", string[7]);
    assertEquals(8, string.length);

//    allSwap(["ax", "bx", "cx", "ay", "cy", "aaa", "abb"]) →
//    ["ay", "bx", "cy", "ax", "cx", "abb", "aaa"]}
    string = new String[]{"ax", "bx", "cx", "ay", "cy", "aaa", "abb"};
    Map2.allSwap_chris(string);
    assertEquals("ay", string[0]);
    assertEquals("bx", string[1]);
    assertEquals("cy", string[2]);
    assertEquals("ax", string[3]);
    assertEquals("cx", string[4]);
    assertEquals("abb", string[5]);
    assertEquals("aaa", string[6]);
    assertEquals(7, string.length);

//  allSwap(["easy", "does", "it", "every", "ice", "eaten"]) →
//  ["every", "does", "ice", "easy", "it", "eaten"]
    string = new String[]{"easy", "does", "it", "every", "ice", "eaten"};
    Map2.allSwap_chris(string);
    assertEquals("every", string[0]);
    assertEquals("does", string[1]);
    assertEquals("ice", string[2]);
    assertEquals("easy", string[3]);
    assertEquals("it", string[4]);
    assertEquals("eaten", string[5]);
    assertEquals(6, string.length);

//}allSwap(["list", "of", "words", "swims", "over", "lily", "water", "wait"]) →
// ["lily", "over", "water", "swims", "of", "list", "words", "wait"]
    string = new String[]{"list", "of", "words", "swims", "over", "lily", "water", "wait"};
    Map2.allSwap_chris(string);
    assertEquals("lily", string[0]);
    assertEquals("over", string[1]);
    assertEquals("water", string[2]);
    assertEquals("swims", string[3]);
    assertEquals("of", string[4]);
    assertEquals("list", string[5]);
    assertEquals("words", string[6]);
    assertEquals("wait", string[7]);
    assertEquals(8, string.length);

//    allSwap(["4", "8", "15", "16", "23", "42"]) →
//    ["42", "8", "16", "15", "23", "4"]
    string = new String[]{"4", "8", "15", "16", "23", "42"};
    Map2.allSwap_chris(string);
    assertEquals("42", string[0]);
    assertEquals("8", string[1]);
    assertEquals("16", string[2]);
    assertEquals("15", string[3]);
    assertEquals("23", string[4]);
    assertEquals("4", string[5]);
    assertEquals(6, string.length);

//    allSwap(["aaa"]) → ["aaa"]
    string = new String[]{"aaa"};
    Map2.allSwap_chris(string);
    assertEquals("aaa", string[0]);
    assertEquals(1, string.length);

//    allSwap([]) → []
    string = new String[]{};
    Map2.allSwap_chris(string);
    assertEquals(0, string.length);

//    allSwap(["a", "b", "c", "xx", "yy", "zz"]) →
//    ["a", "b", "c", "xx", "yy", "zz"]
    string = new String[]{"a", "b", "c", "xx", "yy", "zz"};
    Map2.allSwap_chris(string);
    assertEquals("a", string[0]);
    assertEquals("b", string[1]);
    assertEquals("c", string[2]);
    assertEquals("xx", string[3]);
    assertEquals("yy", string[4]);
    assertEquals("zz", string[5]);
    assertEquals(6, string.length);

  }
}