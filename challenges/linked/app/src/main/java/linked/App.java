/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked;

import types.LinkedList;

public class App {
    private static final LinkedList<Integer> list = new LinkedList<>();
    public static void main(String[] args) {
        list.insertABeginning(1);
        list.insertABeginning(2);
        list.insertABeginning(3);
        System.out.println(list);
        //Check Search
        System.out.println("Is 3 exist? "+list.Includes(3));

//            list.insertAfter(3, 33);
//            System.out.println(list);
//            list.insertBefore(3, 33);
//            System.out.println(list);
    }

}



