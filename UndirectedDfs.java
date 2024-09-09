import java.util.LinkedList;

public class UndirectedDfs {
    private int V ;
    private LinkedList<Integer> adj[];
    UndirectedDfs(int v){
        this.V = v;
        adj= new LinkedList[V];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();

        }

    }
    void addEdge(int v,int w){
        adj[v].add(w);
        adj[w].add(v);

    }
    boolean dfsUtil(int v, boolean visited[], int parents){
        visited[v]  = true;

        for(int neighbour : adj[v]){
            if(!visited[neighbour]){
                if(dfsUtil(neighbour, visited, v)){
                    return true;
                }
            }
            else if (neighbour != parents) {
                return true;
                
            }
        }
        return false;


    }
    boolean dfsCycle (){
        boolean visited[] = new boolean[V];
        
        for(int u=0;u<V;u++){
            if(!visited[u]){
                if(dfsUtil(u,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        UndirectedDfs g1 = new UndirectedDfs(5);

        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(1, 3);
        g1.addEdge(3, 4);

        if (g1.dfsCycle())
        System.out.println("Graph contains cycle");
    else
        System.out.println("Graph doesn't contain cycle");

    }
  
    

    
}
