package hashTable.hashmapChallenges;


import java.util.ArrayList;
import java.util.List;

public class LeftJoin {
    public List<String> leftJoin(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
        if (hashmap1.keySet().isEmpty())
            return null;
        List<String> list = new ArrayList<>(hashmap1.size());
        list.add("\n");
        for (String k : hashmap1.keySet()) {
            list.add("[\""
                    + k + "\"," + "\"" + hashmap1.get(k) + "\"," + "\"" + hashmap2.get(k)
                    + "\"]\n");
        }
        return list;
    }
}
