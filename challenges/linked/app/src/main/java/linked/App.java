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



///
//Create a pull request from your branch to your master branch
//        In your open pull request, leave as a comment a checklist of the specifications and tasks above, with the actual steps that you completed checked off
//        Submitting your completed work to Canvas:
//        Copy the link to your open pull request and paste it into the corresponding Canvas assignment
//        Leave a description of how long this assignment took you in the comments box
//        Add any additional comments you like about your process or any difficulties you may have had with the assignment
//        Merge your branch into master, and delete your branch (don’t worry, the PR link will still work)