import types.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.insertABeginning(1);
        list.insertABeginning(2);
        list.insertABeginning(3);
        // List<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2,3));
        System.out.println(list);
        list.insertAfter(3, 33);
        System.out.println(list);
        list.insertBefore(3, 33);
        System.out.println(list);
    }

    // Upon instantiation, an empty Linked List should be created.

    // your code should raise/throw a custom,
    // semantic error that describes what went wrong in calling the methods you
    // wrote for this lab.

}

// Write tests to prove the following functionality:
// Can successfully instantiate an empty linked list
// Can properly insert into the linked list
// The head property will properly point to the first node in the linked list
// Can properly insert multiple nodes into the linked list
// Will return true when finding a value within the linked list that exists
// Will return false when searching for a value in the linked list that does not
// exist
// Can properly return a collection of all the values that exist in the linked
// list
// Ensure your tests are passing before you submit your solution.