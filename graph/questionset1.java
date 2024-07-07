import java.util.*;

public class questionset1 {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    static void  createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++) graph[i]=new ArrayList<>();

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,1));
    }


    static class info{
        int curr;
        int par;

        public info(int curr,int par){
            this.curr=curr;
            this.par=par;
        }
    }

    static boolean detectCycleBfs(ArrayList<Edge>graph[]){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleBfsUtil(graph,vis)) return true;
            }
        }
        return false;
    }

    static boolean detectCycleBfsUtil(ArrayList<Edge> graph[],boolean vis[]){
        Queue<info> q=new LinkedList<>();
        q.add(new info(0,-1));
        while(!q.isEmpty()){
            info node=q.remove();
            if(!vis[node.curr]){
                vis[node.curr]=true;
                for(int i=0;i<graph[node.curr].size();i++){
                    Edge e=graph[node.curr].get(i);
                    if(!vis[e.dest]) q.add(new info(e.dest,node.curr));
                    else if(vis[e.src] && node.par!=e.dest) return true;
                }
            }
        }
        return false;
    }




    public static void main(String []args){
        ArrayList<Edge> graph[]=new ArrayList[4];
        createGraph(graph);
        System.out.println(detectCycleBfs(graph));
    }
}
