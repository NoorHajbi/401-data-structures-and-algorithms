package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    Graph graph = new Graph();

    // Can successfully instantiate an empty graph
    @Test
    public void testEmpty() {
        assertNotNull("Problem with instantiate an empty graph", graph);
        //empty graph returns null
        assertNull("Problem with instantiate an empty graph", graph.printGraph());
        assertNotNull("Problem with instantiate an empty graph", graph.getNodes());
        // The proper size is returned, representing the number of nodes in the graph
        assertEquals(0, graph.size());
    }

    @Test
    public void testBasics() {
        // Node can be successfully added to the graph
        graph.addNode("Bob");
        graph.addNode("Alice");
        graph.addNode("Mary");
        graph.addNode("Noor");
        // The proper size is returned, representing the number of nodes in the graph
        assertEquals(4, graph.size());
        assertEquals("Vertex{label='Bob'}[]Vertex{label='Noor'}[]Vertex{label='Alice'}[]Vertex{label='Mary'}[]",
                graph.printGraph());
        //    All appropriate neighbors can be retrieved from the graph
        assertEquals("[]", graph.getNeighbors("Noor").toString());


        //An edge can be successfully added to the graph
        graph.addEdge("Bob", "Mary");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Alice", "Bob");
        graph.addEdge("Alice", "Noor");
        assertEquals(
                "Vertex{label='Bob'}[Vertex{label='Mary'}, Vertex{label='Alice'}, Vertex{label='Alice'}]Vertex{label='Noor'}[Vertex{label='Alice'}]Vertex{label='Alice'}[Vertex{label='Bob'}, Vertex{label='Bob'}, Vertex{label='Noor'}]Vertex{label='Mary'}[Vertex{label='Bob'}]",
                graph.printGraph());
        // All appropriate neighbors can be retrieved from the graph
        assertEquals("[Vertex{label='Alice'}]", graph.getNeighbors("Noor").toString());

        // A collection of all nodes can be properly retrieved from the graph
        assertEquals("[Vertex{label='Bob'}, Vertex{label='Noor'}, Vertex{label='Alice'}, Vertex{label='Mary'}]",
                graph.getNodes().toString());

    }

    //    A graph with only one node and edge can be properly returned
    @Test
    public void testOneNodeOneEdge() {
        graph.addNode("Noor");
        assertEquals(1, graph.size());
        assertEquals("Vertex{label='Noor'}[]",
                graph.printGraph());
        assertEquals("[]", graph.getNeighbors("Noor").toString());
        graph.addNode("Alice");

        graph.addEdge("Alice", "Noor");
        assertEquals(
                "Vertex{label='Noor'}[Vertex{label='Alice'}]Vertex{label='Alice'}[Vertex{label='Noor'}]",
                graph.printGraph());
        assertEquals("[Vertex{label='Alice'}]", graph.getNeighbors("Noor").toString());
        assertEquals("[Vertex{label='Noor'}, Vertex{label='Alice'}]",
                graph.getNodes().toString());
    }

}
