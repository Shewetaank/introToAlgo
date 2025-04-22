package org.intro.dataStructure.directedgraph;

import org.junit.Test;

public class TopologicalSortTest {

    @Test
    public void test() {
        AdjacencyListDiGraph graph = new AdjacencyListDiGraph(10);
        graph.addEdge(0, 4);
        graph.addEdge(0, 3);
        graph.addEdge(0, 5);
        graph.addEdge(0, 6);
        graph.addEdge(4, 2);
        graph.addEdge(2, 7);
        graph.addEdge(3, 8);
        graph.addEdge(7, 9);
        graph.addEdge(2, 1);
        graph.addEdge(8, 0);
        graph.addEdge(9, 0);

        TopologicalSort dfs = new TopologicalSort(graph);

        for (Integer integer : dfs.reverseOrder()) {
            System.out.println(integer);
        }
    }
}
