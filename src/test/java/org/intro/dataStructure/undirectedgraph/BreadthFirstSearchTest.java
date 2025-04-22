package org.intro.dataStructure.undirectedgraph;

import org.junit.Test;

import java.util.Stack;

public class BreadthFirstSearchTest {

    @Test
    public void test() {
        AdjacencyListGraph graph = new AdjacencyListGraph(11);
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

        BreadthFirstSearch dfs = new BreadthFirstSearch(graph, 2);
        assert dfs.hasPathTo(0);
        Stack<Integer> stk = dfs.pathTo(0);
        while (!stk.isEmpty()) {
            System.out.println(stk.pop());
        }

        assert !dfs.hasPathTo(10);
    }
}
