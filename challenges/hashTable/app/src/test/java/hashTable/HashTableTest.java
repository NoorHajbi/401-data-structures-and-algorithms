package hashTable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class HashTableTest {
    HashTable<String,Integer> hashtableTest= new HashTable<>();
    HashTable<String,String> stringTest= new HashTable<>();
    HashTable<Integer,Integer> integerTest= new HashTable<>();

    //1. Can successfully instantiate an empty hashTable
    @Test
    public void testEmpty() {
        assertNotNull("Problem with instantiate an empty hashTable", hashtableTest);
        assertEquals(0, hashtableTest.getSize());
        assertTrue(hashtableTest.isEmpty());
        assertNull(hashtableTest.remove("Not existed value"));
    }
    @Test
    public void testOneItem() {
        //Can successfully instantiate a hashTable with a single  item
        hashtableTest.add("Noor", 200);
       assertNotNull(hashtableTest);
        assertEquals(2433924,hashtableTest.hashCode("Noor"));
        assertEquals(24,hashtableTest.getBucketIndex("Noor"));
        assertEquals(1 , hashtableTest. getSize());
        assertFalse(hashtableTest.isEmpty());
        assertNull(hashtableTest.get("Not existed value"));
        assertEquals("200", hashtableTest.get("Noor").toString());
        assertEquals("200", String.valueOf(hashtableTest.remove("Noor")));
        assertEquals(0, hashtableTest. getSize());
    }

}





