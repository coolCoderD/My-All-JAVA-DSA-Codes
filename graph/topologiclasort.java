import java.util.*;


public class topologiclasort {
    static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,3));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,0));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static void topSort(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]) topSortUtil(graph,i,vis,st);
        }
        while(!st.isEmpty()) System.out.print(st.pop()+" ");
    }
    public static void topSortUtil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> st){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]) topSortUtil(graph,e.dest,vis,st);
        }
        st.push(curr);
    }






    // public static void calcInDeg(ArrayList<Edge> graph[],int indeg[]){
    //     for(int i=0;i<graph.length;i++){
    //         for(int j=0;j<graph[i].size();j++){
    //             Edge e=graph[i].get(j);
    //             indeg[e.dest]++;
    //         }
    //     }
    // }


    // public static void topSortBfs(ArrayList<Edge> graph[]){
    //     int indeg[]=new int[graph.length];
    //     calcInDeg(graph, indeg);
    //     Queue<Integer> q=new LinkedList<>();
    //     for(int i=0;i<indeg.length;i++){
    //         if(indeg[i]==0){
    //             q.add(i);
    //         }
    //     }

    //     while(!q.isEmpty()){
    //         int curr=q.remove();
    //         System.out.print(curr+" ");
    //         for(int i=0;i<graph[curr].size();i++){
    //             Edge e=graph[curr].get(i);
    //             indeg[e.dest]--;
    //             if(indeg[e.dest]==0) q.add(e.dest);
    //         }
    //     }
    // }




    // //Print All Path
    // static void printAllPath(ArrayList<Edge> graph[],int src,int dest,String path){
    //     if(src==dest){
    //         System.out.println(path+src);
    //         return;
    //     }

    //     for(int i=0;i<graph[src].size();i++){
    //         Edge e=graph[src].get(i);
    //         printAllPath(graph, e.dest, dest, path+src);
    //     }
    // }
    



    public static void main(String []args){
        ArrayList<Edge> graph[]=new ArrayList[6];
        createGraph(graph);
        topSort(graph);
        // System.out.println("DFS");
        // topSort(graph);
        // printAllPath(graph, 5, 4, new String(""));
    }
}
