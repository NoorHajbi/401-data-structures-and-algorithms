package hashTable.hashmapChallenges;

import hashTable.HashTable;


public class RepeatedWord {
    public String repeatedWord(String sentence) {
        HashTable<String, Integer> hashtable = new HashTable<>();
        String[] arr = sentence.split("\\s+");  //remove spaces
        int value = 0;
        for (String word : arr) {
            word = word.replaceAll("[^a-zA-Z ]", "").toLowerCase();  //remove all punctuation

            if (hashtable.includes(word))
                return word;
            hashtable.add(word, value++);
            System.out.print("key -> " + word);
            System.out.println(", value -> " + value);
        }

        return "There is no repeated words";
    }

}
