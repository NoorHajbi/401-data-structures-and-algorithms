package stackQueue;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    private static final StackLinkedList<Integer> testStack = new StackLinkedList<>();
    private static final QueueLinkedList<Integer> testQueue = new QueueLinkedList<>();
    private static final pseudoQueue<Integer> testPseudoQueue = new pseudoQueue<>();

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
                2,
                testStack.peek()
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
                -2147483648,
                testStack.peek()
        );
        assertEquals(
                "Error wit Queue when peek on empty:\n ",
                "Queue is Empty",
                testQueue.peek()
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
                2,
                testStack.pop()
        );
        assertEquals(
                "Error with dequeue:\n ",
                "1",
                String.valueOf(testQueue.dequeue())
        );
        assertEquals(
                "Error with pop:\n ",
                1,
                testStack.pop()
        );
        assertEquals(
                "Error with dequeue:\n ",
                "2",
                String.valueOf(testQueue.dequeue())
        );
    }

    @Test
    public void testPopDequeueEmpty() {
        assertEquals(
                "Error with pop:\n ",
                -2147483648,
                testStack.pop()
        );
        assertEquals(
                "Error with dequeue:\n ",
                "The queue is empty",
                testQueue.dequeue()
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
    @Test
    public void testEmptyPseudoQueue() {
        assertEquals(
                "null failed:\n ",
                "Please fill the Linked List",
                String.valueOf(testPseudoQueue.stackList2)
        );
        assertEquals(
                "null failed:\n ",
                -2147483648,
                testPseudoQueue.dequeue()
        );
    }


}