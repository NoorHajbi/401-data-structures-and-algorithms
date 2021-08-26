package hashTable.hashmapChallenges;


public class RepeatedWord {

    /**
     * repeatedWord
     *
     * @return String
     */
    public String repeatedWord(String sentence) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] arr = sentence.split("\\s+");  //remove spaces
        int value = 0;
        for (String word : arr) {
            word = word.replaceAll("[^a-zA-Z ]", "").toLowerCase();  //remove all punctuations

            if (hashMap.containsKey(word))
                return word;
            hashMap.put(word, value++);
            System.out.print("key -> " + value);
            System.out.println(", value -> " + word);
        }
        return "There is no repeated words";
    }

}
