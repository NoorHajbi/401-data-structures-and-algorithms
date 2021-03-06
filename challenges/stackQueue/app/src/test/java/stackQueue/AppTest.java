/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stackQueue;

import data.Animal;
import data.Cat;
import data.Dog;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    private static final StackLinkedList<Integer> testStack = new StackLinkedList<>();
    private static final QueueLinkedList<Integer> testQueue = new QueueLinkedList<>();
    private static final pseudoQueue<Integer> testPseudoQueue = new pseudoQueue<>();
    private static final AnimalShelter testShelterDog = new AnimalShelter();
    private static final AnimalShelter testShelterCat = new AnimalShelter();

    // 1.Can successfully instantiate an empty stack & Can successfully instantiate an empty queue
    @Test
    public void testEmptySQ() {
        assertNull("null failed", testStack.top);
        assertNull("null failed", testQueue.front);
    }

    // 2. Can successfully push onto a stack & Can successfully enqueue into a queue
//    @Test
//    public void testInsert() {
//        testStack.push(1);
//        testQueue.enqueue(1);
//        assertEquals(
//                "Error with Stack Insertion:\n ",
//                "{ 1 } -> NULL",
//                String.valueOf(testStack)
//        );
//
//        assertEquals(
//                "Error with Queue Insertion:\n ",
//                "{ 1 } -> NULL",
//                String.valueOf(testQueue)
//        );
//
//        //3. Can successfully push multiple values onto a stack &  Can successfully enqueue multiple values into a queue
//        testStack.push(2);
//        testQueue.enqueue(2);
//        assertEquals(
//                "Error with multiple Stack Insertion:\n ",
//                "{ 2 } -> { 1 } -> NULL",
//                String.valueOf(testStack)
//        );
//        testStack.pop();
//        testStack.pop();
//        testQueue.dequeue();
//        testQueue.dequeue();
//    }

    //4. Can successfully peek
    @Test
    public void testPeekFull() {
        testStack.push(1);
        testQueue.enqueue(1);
        testStack.push(2);
        testQueue.enqueue(2);
        assertEquals(
                "Error with Stack peek:\n ",
                "2",
                String.valueOf(testStack.peek())
        );
        assertEquals(
                "Error with Queue peek:\n ",
                "1",
                String.valueOf(testQueue.peek())
        );
    }

    //4. Can successfully raise exception when peek on empty
    @Test
    public void testPeekEmpty() {
        assertEquals(
                "Error with peek on empty:\n ",
                "Stack is Empty, So the returned Peek-> ",
                testStack.peek()
        );
        assertEquals(
                "Error wit Queue when peek on empty:\n ",
                "Queue is Empty",
                String.valueOf(testQueue.peek())
        );
    }

    //5. Can successfully pop off the stack & dequeue out of a queue the expected value
    //6. check empty
    @Test
    public void testPopDequeue() {
        testStack.push(1);
        testQueue.enqueue(1);
        testStack.push(2);
        testQueue.enqueue(2);
        assertFalse("Error when call isEmpty() with full Stack:\n ", testStack.isEmpty());
        assertFalse("Error when call isEmpty() with full queue:\n ", testQueue.isEmpty());
        assertEquals(
                "Error with pop:\n ",
                "2",
                String.valueOf(testStack.pop())
        );
        assertEquals(
                "Error with dequeue:\n ",
                "1",
                String.valueOf(testQueue.dequeue())
        );
        assertEquals(
                "Error with pop:\n ",
                "1",
                String.valueOf(testStack.pop())
        );
        assertEquals(
                "Error with dequeue:\n ",
                "2",
                String.valueOf(testQueue.dequeue())
        );
    }

    @Test
    public void testPopDequeueEmpty() {
//        assertEquals(
//                "Error with pop:\n ",
//                "Stack is Empty",
//                String.valueOf(testStack.pop())
//        );
        assertEquals(
                "Error with dequeue:\n ",
                "The queue is empty",
                String.valueOf(testQueue.dequeue())
        );

        assertTrue("Error when call isEmpty() with empty Stack:\n ", testStack.isEmpty());
        assertTrue("Error when call isEmpty() with empty queue:\n ", testQueue.isEmpty());
    }

    //Code Challenge 11- Stack Queue Pseudo
//    Happy Path - Expected outcome
    @Test
    public void testHappyPseudoQueue() {
        testPseudoQueue.enqueue(20);
        testPseudoQueue.enqueue(15);
        testPseudoQueue.enqueue(10);
        testPseudoQueue.enqueue(5);
        //(1)
        assertEquals(
                "Error with enqueue in two Stacks peek:\n ",
                "{ 5 } -> { 10 } -> { 15 } -> { 20 } -> NULL",
                String.valueOf(testPseudoQueue)
        );
        //(2) also it is  Edge Case, because stack2 is empty, so it will talk more time
        assertEquals(
                "Error with dequeue in two Stacks peek:\n ",
                20,
                testPseudoQueue.dequeue()
        );
        //(3)
        assertEquals(
                "Error with dequeue in two Stacks peek:\n ",
                15,
                testPseudoQueue.dequeue()
        );

        testPseudoQueue.dequeue();
        testPseudoQueue.dequeue();

        //(4)
        testPseudoQueue.enqueue(5);
        assertEquals(
                "Error with enqueue in two Stacks peek:\n ",
                "{ 5 } -> NULL",
                String.valueOf(testPseudoQueue)
        );
        testPseudoQueue.dequeue();

    }

    //    Expected failure
//    @Test
//    public void testEmptyPseudoQueue() {
//        assertEquals(
//                "null failed:\n ",
//                "Please fill the Linked List",
//                String.valueOf(testPseudoQueue.stackList2)
//        );
//        assertEquals(
//                "null failed:\n ",
//                "Stack is Empty",
//                String.valueOf(testPseudoQueue.dequeue())
//        );

//    }

    //Code Challenge 12- Stack Queue Animal Shelter
    @Test
    public void testAnimalShelter() {
        assertEquals("Please fill the queue", String.valueOf(testShelterDog));
        assertEquals("Please fill the queue", String.valueOf(testShelterCat));

        Dog dog1 = new Dog("Bobby");
        Cat cat1 = new Cat("Migalo");
        Dog dog2 = new Dog("Milo");
        Cat cat2 = new Cat("Lilly");
        Dog dog3 = new Dog("Foxy");
        assertEquals(
                "failed to dequeue unexpected value:\n ",
                "null",
                String.valueOf(testShelterDog.dequeue("Turtle"))
        );

        testShelterDog.enqueue(dog1);
        assertEquals(
                "Error with enqueue dog1:\n ",
                "{ Dog{name='Bobby'} } -> NULL",
                String.valueOf(testShelterDog)
        );
        testShelterCat.enqueue(cat1);
        assertEquals(
                "Error with enqueue cat1:\n ",
                "{ Cat{name='Migalo'} } -> NULL",
                String.valueOf(testShelterCat)
        );
        testShelterCat.enqueue(cat2);
        testShelterDog.enqueue(dog2);
        testShelterDog.enqueue(dog3);
        assertEquals(
                "Error with enqueue cats:\n ",
                "{ Cat{name='Migalo'} } -> { Cat{name='Lilly'} } -> NULL",
                String.valueOf(testShelterCat)
        );
        assertEquals(
                "Error with enqueue dogs:\n ",
                "{ Dog{name='Bobby'} } -> { Dog{name='Milo'} } -> { Dog{name='Foxy'} } -> NULL",
                String.valueOf(testShelterDog)
        );
        //Dequeue first
        Animal first = testShelterDog.dequeue("dog");
        assertEquals(
                "Error with dequeue first:\n ",
                "Bobby",
                first.getName()
        );
        //Dequeue middle
        Animal middle = testShelterDog.dequeue("dog");
        assertEquals(
                "Error with dequeue first:\n ",
                "Milo",
                middle.getName()
        );
        //Dequeue last
        Animal last = testShelterDog.dequeue("dog");
        assertEquals(
                "Error with dequeue first:\n ",
                "Foxy",
                last.getName()
        );
        //Dequeue null
        Animal noDogs = testShelterDog.dequeue("dog");
        assertEquals(
                "Error with dequeue first:\n ",
                "null",
                String.valueOf(noDogs)
        );
    }

    @Test
    public void testEmptyAS() {
        assertNull("null failed", testShelterDog.dequeue(""));
        assertNull("null failed", testShelterCat.dequeue(""));
    }

    //Code Challenge 13 - Stack Queue Brackets
    @Test
    public void testBrackets() {
        //Happy Path - Expected outcome
        assertTrue(StackBrackets.validateBrackets("{}"));
        assertTrue(StackBrackets.validateBrackets("{}(){}"));
        assertTrue(StackBrackets.validateBrackets("()[[Extra Characters]]"));
        assertTrue(StackBrackets.validateBrackets("(){}[[]]"));
        assertTrue(StackBrackets.validateBrackets("{}{Code}[Fellows](())"));
        assertFalse(StackBrackets.validateBrackets("[({}]"));
        assertFalse(StackBrackets.validateBrackets("(]("));
        assertFalse(StackBrackets.validateBrackets("{(})"));
        assertFalse(StackBrackets.validateBrackets("{"));
        assertFalse(StackBrackets.validateBrackets(")"));
        assertFalse(StackBrackets.validateBrackets("[}"));

        // Expected failure & Edge Case
        assertFalse(StackBrackets.validateBrackets("[}\t"));
        assertFalse(StackBrackets.validateBrackets(""));
        assertFalse(StackBrackets.validateBrackets("\t[}\t"));
        assertFalse(StackBrackets.validateBrackets(" ("));
        assertFalse(StackBrackets.validateBrackets(" ( "));
        assertFalse(StackBrackets.validateBrackets("( "));

    }


}
