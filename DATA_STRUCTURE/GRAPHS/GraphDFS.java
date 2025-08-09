package DATA_STRUCTURE.GRAPHS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GraphDFS {
    private Map<Integer, List<Integer>> adjList;

    public GraphDFS(){
        adjList = new HashMap<>();
    }

    public void addVertex(int value){
        adjList.put(value, new LinkedList<>());
    }

    public void addEdge(int start, int destination){
        adjList.get(start).add(destination);
    }

    public void DFS(int start, boolean[] visited){
        visited[start] = true;
        System.out.print(start + " ");

        for(int neighbour : adjList.get(start)){
            if(!visited[neighbour]){
                DFS(neighbour, visited);
            }
        }
    }

    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS();
        for (int i = 0; i < 5; i++) graph.addVertex(i);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        boolean[] visited = new boolean[5];
        System.out.println("DFS starting from vertex 2:");
        graph.DFS(0, visited);
    }
}
