/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.*;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    static boolean IdentifyAnagrams1(String str1, String str2) {
        char[] str1Array = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] str2Array = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        if (str1Array.length != str2Array.length) {
            return false;
        } else {
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            return Arrays.equals(str1Array, str2Array);
        }
    }

    static boolean IdentifyAnagrams(String str1, String str2) {
        char[] str1Array = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] str2Array = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        System.out.println(str1Array);
        System.out.println();
        System.out.println(str2Array);

        if (str1Array.length != str2Array.length) {
            return false;
        }
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            hashMap1.put(str1Array[i], 0);
            hashMap2.put(str2Array[i], 0);
        }
        System.out.println(hashMap1);
        System.out.println();
        System.out.println(hashMap2);

        return hashMap1.equals(hashMap2);
//        In simple words, == checks if both objects point to the same memory location
//        whereas . equals() evaluates to the comparison of values in the objects.
    }

    /**********************************/
//    Given an adjacency matrix representation of a graph, return the adjacency list representation.
    static String adjacencyListRepresentation(int[][] matrix) {
        if (matrix.length == 0)
            return "The matrix is empty";
        List<List<String>> adjacencyList = new ArrayList<>(matrix[0].length);
        char letter;
        //It will create indexes for the vertices
        for (int i : matrix[0]) {
            adjacencyList.add(new ArrayList<>(i));
        }
        System.out.println(adjacencyList);


        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                //if it is edge
                if (matrix[i][j] == 1) {
                    letter = (char) ((int) 'a' + j);
                    adjacencyList.get(i).add(String.valueOf(letter));
                }

            }
        }
        System.out.println(adjacencyList);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < adjacencyList.size(); i++) {
            letter = (char) ((int) 'a' + i);
            stringBuilder.append(letter).append("|");
            for (String edge : adjacencyList.get(i)) {
                stringBuilder.append(" -> ").append(edge);

            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    //    static void printArrayList(ArrayList<ArrayList<Integer>>
//                                       adjListArray)
//    {
//        // Print the adjacency list
//        for (int v = 0; v < adjListArray.size(); v++) {
//            int rem = v%26;
//            char letter = (char)((int)'a' + rem);
//                System.out.print(""+letter);
//            for (Integer u : adjListArray.get(v)) {
//                System.out.print(" -> " + u);
//            }
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Graph graph = new Graph();
        graph.addNode("Pandora");
        graph.addNode("Arendelle");
        graph.addNode("Metroville");
        graph.addNode("Monstroplolis");
        graph.addNode("Narnia");
        graph.addNode("Naboo");
//

//        graph.addEdge("Pandora", "Arendelle");
//        graph.addEdge("Arendelle", "Metroville");
//        graph.addEdge("Arendelle", "Monstroplolis");
//        graph.addEdge("Metroville", "Monstroplolis");
//        graph.addEdge("Metroville", "Narnia");
//        graph.addEdge("Metroville", "Naboo");
//        graph.addEdge("Monstroplolis", "Naboo");


//        System.out.println(graph);
//        System.out.println(graph.printGraph());
//        graph.removeVertex("Bob");
//        graph.removeEdge("Alice","Noor");
//        System.out.println( graph.printGraph());
//        System.out.println( graph.size());
//        System.out.println(graph.getNeighbors("Noor"));
//        System.out.println(graph.getNodes());

//        System.out.println(IdentifyAnagrams1("Astronomers", "Moon starers"));
//        System.out.println(IdentifyAnagrams("fried", "fired"));

        /***/
        int[][] list = {{0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}};


//        System.out.println(adjacencyListRepresentation(list));
        System.out.println(graph.breadthFirst("Naboo"));

    }
}
//Pandora, Arendelle, Metroville, Monstroplolis, Narnia, Naboo
