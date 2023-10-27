import com.kirkwood.contribution2.Map2;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Kate {
    @Test
    void wordLen_kate() {
        // wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
        String[] strings1 = {"a", "bb", "a", "bb"};
        Map<String, Integer> map1 = Map2.wordLen_kate(strings1);
        assertEquals(2, map1.get("bb"));
        assertEquals(1, map1.get("a"));
        // wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
        String[] strings2 = {"this", "and", "that", "and"};
        Map<String, Integer> map2 = Map2.wordLen_kate(strings2);
        assertEquals(4, map2.get("that"));
        assertEquals(3, map2.get("and"));
        assertTrue(4 == map2.get("this"));
        // wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
        String[] strings3 = {"code", "code", "code", "bug"};
        Map<String, Integer> map3 = Map2.wordLen_kate(strings3);
        assertEquals(4, map3.get("code"));
        assertTrue(3 == map3.get("bug"));
        // wordLen([]) → {}
        String[] strings4 = new String[0];
        Map<String, Integer> map4 = Map2.wordLen_kate(strings4);
        assertTrue(map4.isEmpty());
        // wordLen(["z"]) → {"z": 1}
        String[] strings5 = {"z"};
        Map<String, Integer> map5 = Map2.wordLen_kate(strings5);
        assertEquals(1, map5.get("z"));
    }
}