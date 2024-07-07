import java.util.ArrayList;
import java.util.PriorityQueue;

public class bellmanfordalgo {


    public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
        public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        // graph[0].add(new Edge(0,1,2));
        // graph[0].add(new Edge(0,2,4));
        // graph[1].add(new Edge(1,2,-4));
        // graph[2].add(new Edge(2,3,2));
        // graph[3].add(new Edge(3,4,4));
        // graph[4].add(new Edge(4,1,-1));



        // graph[0].add(new Edge(0,3,30));
        // graph[0].add(new )
    }


    public static void bellmanFord(ArrayList<Edge> graph[],int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(i!=src) dist[i]=Integer.MAX_VALUE;
        }
        int V=graph.length;
        for(int i=0;i<V-1;i++){
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }


    //Prism
    static class  primspair implements Comparable{
        int v;
        int cost;

        public prism(int v,int cost){
            this.v=v;
            this.cost=cost;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    }


    public static void prims (ArrayList<primspair> graph[]){
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<primspair> pq=new PriorityQueue<>();
        pq.add(new primspair(0,0));
        int finalCost=0;
        while(!pq.isEmpty()){
            primspair curr=q.remove();
            if(!vis[curr.v]){
                vis[curr.v]=true;
                finalCost+=curr.cost;
                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    pq.add(new primspair(e.dest,e.wt));
                }
            }
        }

        System.out.println(finalCost);
        
    
    }




    public static void main(String[]args){
        ArrayList<Edge> graph[]=new ArrayList[4];
        createGraph(graph);
        
    }
}
