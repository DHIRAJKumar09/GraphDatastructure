public class Graph1 {
    private int V;
    private int adjMatrix[][];
    Graph1(int v){
        V =v;
        adjMatrix = new int[v][v];

    }
    void addEdge(int i,int j){
        adjMatrix[i][j]=1;
        adjMatrix[j][i] = 1;
        
    }
    void removeEdge(int i,int j){
        adjMatrix[i][j]=0;
        adjMatrix[j][i] =0;
    }
    void printMatrix(){
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Graph1 g = new Graph1(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.printMatrix();
    }
    
    
}
