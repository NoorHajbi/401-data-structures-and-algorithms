package hashTable;

import hashTable.hashmapChallenges.HashMap;
import hashTable.hashmapChallenges.LeftJoin;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeftJoinTest {


    LeftJoin leftJoin = new LeftJoin();
    HashMap<String, String> map = new HashMap<>();
    HashMap<String, String> map2 = new HashMap<>();

    //1. Test empty class and empty hashmaps (Expected failure & Edges cases)
    @Test
    public void testEmpty() {
        assertNotNull("Problem with instantiate an empty treeIntersection",
                leftJoin);
        assertNotNull(map.toString());
        assertNull(leftJoin.leftJoin(map, map2));
    }

    //2. first Is Empty
    @Test
    public void firstIsEmpty() {
        map2.put("fond", "averse");
        map2.put("wrath", "delight");
        map2.put("diligent", "idle");
        map2.put("guide", "follow");
        map2.put("flow", "jam");

        assertNull(leftJoin.leftJoin(map, map2));
    }

    //3. Second Is Empty
    @Test
    public void secondIsEmpty() {
        map.put("fond", "enamored");
        map.put("wrath", "anger");
        map.put("diligent", "employed");
        map.put("outfit", "grab");
        map.put("guide", "usher");

        assertEquals("[\n" +
                ", [\"fond\",\"enamored\",\"null\"]\n" +
                ", [\"wrath\",\"anger\",\"null\"]\n" +
                ", [\"diligent\",\"employed\",\"null\"]\n" +
                ", [\"outfit\",\"grab\",\"null\"]\n" +
                ", [\"guide\",\"usher\",\"null\"]\n" +
                "]", leftJoin.leftJoin(map, map2).toString());
    }

    //4. Test happy paths
    @Test
    public void testHappyPath() {
        map.put("fond", "enamored");
        map.put("wrath", "anger");
        map.put("diligent", "employed");
        map.put("outfit", "grab");
        map.put("guide", "usher");

        map2.put("fond", "averse");
        map2.put("wrath", "delight");
        map2.put("diligent", "idle");
        map2.put("guide", "follow");
        map2.put("flow", "jam");

        assertEquals(
                "Happy path test:",
                "[\n" +
                        ", [\"fond\",\"enamored\",\"averse\"]\n" +
                        ", [\"wrath\",\"anger\",\"delight\"]\n" +
                        ", [\"diligent\",\"employed\",\"idle\"]\n" +
                        ", [\"outfit\",\"grab\",\"null\"]\n" +
                        ", [\"guide\",\"usher\",\"follow\"]\n" +
                        "]",
                leftJoin.leftJoin(map, map2).toString()
        );
    }
}
