package hashTable;

import hashTable.hashmapChallenges.RepeatedWord;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {
    RepeatedWord repeatedTest = new RepeatedWord();
    String sentence;
    String repeatedWord;


    //1. Test empty class and empty sentences (Expected failure & Edges cases)
    @Test
    public void testEmpty() {
        assertNotNull("Problem with instantiate an empty hashTable",
                repeatedTest);

        assertEquals("There is no repeated words",
                repeatedTest.repeatedWord(""));

        assertEquals("There is no repeated words",
                repeatedTest.repeatedWord("         "));
    }

    @Test
    public void NotRepeated() {
        sentence = "Hello My Name is Noor";
        repeatedWord = repeatedTest.repeatedWord(sentence);


        assertEquals(
                "Not repeated word test failed:",
                "There is no repeated words",
                repeatedWord
        );
    }

    @Test
    public void testPunctuations() {
        sentence = "Hello.,-)(*@#$%^!! My Name is Noor";
        repeatedWord = repeatedTest.repeatedWord(sentence);

        assertEquals(
                "sentence with punctuations test:",
                "There is no repeated words",
                repeatedWord
        );

        sentence = "Hello .,-)(*@#$%^!! My Name is Noor, hello";
        repeatedWord = repeatedTest.repeatedWord(sentence);
        assertEquals(
                "sentence with punctuations test:",
                "hello",
                repeatedWord
        );

    }

    //2. Test happy paths

    @Test
    public void testHappyPath1() {
        sentence = "Once upon a time, there was a brave princess who...";
        repeatedWord = repeatedTest.repeatedWord(sentence);

        assertEquals(
                "Happy path1 test:",
                "a",
                repeatedWord
        );
    }

    @Test
    public void testHappyPath2() {
        sentence = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age " +
                "of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";

        repeatedWord = repeatedTest.repeatedWord(sentence);
        assertEquals(
                "Happy path2 test:",
                "it",
                repeatedWord
        );
    }

    @Test
    public void testHappyPath3() {
        sentence = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know " +
                "what I was doing in New York...";
        repeatedWord = repeatedTest.repeatedWord(sentence);
        assertEquals(
                "Happy path3 test:",
                "summer",
                repeatedWord
        );
    }

}
