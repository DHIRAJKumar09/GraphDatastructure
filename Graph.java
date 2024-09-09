import java.util.LinkedList;

class Graph{
    private int V;
    private LinkedList<Integer>adj[];

    Graph(int v){
        V = v;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i] = new LinkedList();

        }
    }
    void addEdge(int v,int w){
        adj[v].add(w);
        adj[w].add(v);
    }
    void PrintGraph(){
        for(int i=0;i<V;i++){
            System.out.print("adjacency List of vertex "+i);
            for(Integer  node : adj[i]){
                System.out.print("=>"+node);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.PrintGraph();
    }
}