package graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BusinessTripTest {
    Graph graph = new Graph();
    List<Object> path1 = new ArrayList<>();

    //graph and list are empty
    @Test
    public void testEmpty() {
        assertEquals("Problem with empty graph", "null", graph.businessTrip(graph, path1));
    }

    @Test
    public void testOnlyListItem() {
        graph.addNode("Pandora");
        graph.addNode("Arendelle");
        graph.addNode("Metroville");
        graph.addNode("Monstroplolis");
        graph.addNode("Narnia");
        graph.addNode("Naboo");

        graph.addWeightedEdges("Pandora", "Arendelle", 150);
        graph.addWeightedEdges("Pandora", "Metroville", 82);


        graph.addWeightedEdges("Arendelle", "Metroville", 99);
        graph.addWeightedEdges("Arendelle", "Monstroplolis", 42);

        graph.addWeightedEdges("Metroville", "Monstroplolis", 105);
        graph.addWeightedEdges("Metroville", "Narnia", 37);
        graph.addWeightedEdges("Metroville", "Naboo", 26);

        graph.addWeightedEdges("Monstroplolis", "Naboo", 73);
        graph.addWeightedEdges("Narnia", "Naboo", 250);

        path1.add("Metroville");
        assertEquals("Problem with on item in the list",
                "null",
                graph.businessTrip(graph, path1));

    }

    @Test
    public void testHappyPath() {
        graph.addNode("Pandora");
        graph.addNode("Arendelle");
        graph.addNode("Metroville");
        graph.addNode("Monstroplolis");
        graph.addNode("Narnia");
        graph.addNode("Naboo");

        graph.addWeightedEdges("Pandora", "Arendelle", 150);
        graph.addWeightedEdges("Pandora", "Metroville", 82);


        graph.addWeightedEdges("Arendelle", "Metroville", 99);
        graph.addWeightedEdges("Arendelle", "Monstroplolis", 42);

        graph.addWeightedEdges("Metroville", "Monstroplolis", 105);
        graph.addWeightedEdges("Metroville", "Narnia", 37);
        graph.addWeightedEdges("Metroville", "Naboo", 26);

        graph.addWeightedEdges("Monstroplolis", "Naboo", 73);
        graph.addWeightedEdges("Narnia", "Naboo", 250);

        path1.add("Metroville");
        path1.add("Pandora");
        List<Object> path2 = new ArrayList<>();
        path2.add("Arendelle");
        path2.add("Monstroplolis");
        path2.add("Naboo");

        List<Object> path3 = new ArrayList<>();
        path3.add("Naboo");
        path3.add("Pandora");

        List<Object> path4 = new ArrayList<>();
        path4.add("Narnia");
        path4.add("Arendelle");
        path4.add("Naboo");

        assertEquals("Happy Path1: ",
                "True, $82",
                graph.businessTrip(graph, path1));

        assertEquals("Happy path2: ",
                "True, $115",
                graph.businessTrip(graph, path2));

        assertEquals("Happy path3: ",
                "False, $0",
                graph.businessTrip(graph, path3));

        assertEquals("Happy path4: ",
                "False, $0",
                graph.businessTrip(graph, path4));
    }


}
