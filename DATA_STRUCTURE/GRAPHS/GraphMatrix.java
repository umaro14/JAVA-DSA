package DATA_STRUCTURE.GRAPHS;

public class GraphMatrix {
    private int [][] adjMatrix;
    private int numVertices;

    public GraphMatrix(int numVertices){
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int start, int destination){
        adjMatrix[start][destination] = 1;
        adjMatrix[destination][start] = 1;
    }

    public void printGraph(){
        for(int i = 0; i < numVertices; i++){
            System.out.print( i + ": ");
            for(int j = 0; j < numVertices; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(4);

        //we add the vlues we want to cannect
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        
        

        System.out.println("Adjacency Matrix:");
        graph.printGraph();
    }
}
