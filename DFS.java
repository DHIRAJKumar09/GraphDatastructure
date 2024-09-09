import java.util.LinkedList;
import java.util.Queue;
public class DFS {
    private int V;
    private LinkedList<Integer>adj[];

    DFS(int v){
        V = v ;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();

        }

    }
    void addEdge(int v,int w){
        adj[v].add(w);
        adj[w].add(v);
    }
    void dfsutil(int v,boolean visited[]){
        visited[v] = true;
        System.out.print(" "+v);
        for(int neighbour: adj[v]){
            if(!visited[neighbour]){
               dfsutil(neighbour, visited);

            }
        }
    }
  
    void dfs(int v){
        boolean visited[] = new boolean[V];
        dfsutil(v,visited);
    }
    public static void main(String[] args){
        DFS g = new DFS(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        g.dfs(0);
    }

    
}
