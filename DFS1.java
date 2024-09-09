import java.util.LinkedList;
public class DFS1 {
    private int V;
    private LinkedList<Integer> adj[];
    DFS1(int v){
        V = v;
        adj= new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int v,int w){
        adj[v].add(w);
        adj[w].add(v);

    }
    void dfsUtil(int v,boolean visited[]){
        visited[v] = true;
        System.out.println(v+" ");
        for(int neighbour : adj[v]){
            if(!visited[neighbour]){
                dfsUtil(neighbour, visited);
            }

        }

    }
    void dfs1(int v){
        boolean visited[] = new boolean[V];
        dfsUtil(v,visited);
    }
    public static void main(String[] args){
        DFS1 g = new DFS1(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.println("Depth First Traversal starting from vertex 0:");

        g.dfs1(0);  
    }

    
}
