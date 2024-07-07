import java.util.*;


public class directedgraphcycle {
    static  class  Edge{
        int src;
        int dest;

        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    static  void createGraph(ArrayList<Edge> graph[]){

        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }


        graph[0].add(new Edge(0,2));
        // graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));

    }

    static  boolean detectCycleDirected(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        boolean st[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if (detectCycleDirectedUtil(graph,i,vis,st)) return true;
            } 
        }
        return false;
    }

    static boolean detectCycleDirectedUtil(ArrayList<Edge> graph[],int curr,boolean vis[],boolean st[]){
        st[curr]=true;
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(st[e.dest]) return true;
            if(!vis[e.dest] && detectCycleDirectedUtil(graph, e.dest, vis, st)) return true;
        }

        st[curr]=false;
        return false;
    }






    public static void main(String[]args){
        ArrayList<Edge> graph[]=new ArrayList[4];
        createGraph(graph);
        System.out.print(detectCycleDirected(graph));
    }
}
