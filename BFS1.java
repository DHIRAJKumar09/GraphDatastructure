import java.util.LinkedList;
import java.util.Queue;
public class BFS1 {
    private int V;
    private LinkedList<Integer> adj[];

    BFS1(int v){
        V=v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int v,int w){
        adj[v].add(w);
        adj[w].add(v);

    }
    void bfs1(int s){
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node +" ");
            for(int neighbour : adj[node]){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
       
    }
    public static void main(String args[]){
        BFS1 g = new BFS1(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        g.bfs1(0);
    }
    
    
}
