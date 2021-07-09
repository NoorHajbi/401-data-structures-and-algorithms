import types.LinkedList;

public class App {
    private static final LinkedList<Integer> list = new LinkedList<>();
    private static final LinkedList<Integer> list2 = new LinkedList<>();
    public static void main(String[] args) {
        list.insertABeginning(1);
        list.insertABeginning(2);
        list.insertABeginning(3);
        list2.insertABeginning(4);
        list2.insertABeginning(5);
        list2.insertABeginning(6);
        System.out.println(list);
        System.out.println(list2);
        System.out.println("Plaindrome "+list.checkPalindrome());
        // list.zipLists(list,list2);
        System.out.println(list);
        
        //Check Search
//        System.out.println("Is 3 exist? " + list.Includes(3));
//        list.append(40);
//        list.append(41);
//        System.out.println(list);
//        list.insertBefore(2, 23);
//        list.insertBefore(3, 33);
//        list.insertAfter(3, 35);
//        list.insertAfter(2, 25);
//        list.insertAfter(1, 15);
//        System.out.println(list);

        // System.out.println(list.kthFromEnd(0));
        // System.out.println(list.kthFromEnd(-1));
        // System.out.println(list.kthFromEnd(5));
    }

}



