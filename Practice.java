// import java.util.*;

// public class Practice {

//     static int tree[];

//     static void init(int n){
//         tree=new int[4*n];
//     }

//     static void buildSt(int arr[],int i,int si,int sj){
//         if(si==sj){
//             tree[i]=arr[si];
//             return;
//         }
//         int mid=(si+sj)/2;
//         buildSt(arr,2*i+1,si,mid);
//         buildSt(arr,2*i+2,mid+1,sj);
//         tree[i]=Math.max(tree[2*i+1],tree[2*i+2]);
//     }

//     static int getMax(int arr[],int qi,int qj){
//         int n=arr.length;
//         return getMaxUtil(arr,0,0,n-1,qi,qj);
//     }

//     static int getMaxUtil(int arr[],int i,int si,int sj,int qi,int qj){
//         if(si>qj || qi>sj) return Integer.MIN_VALUE;
//         if(qi<=si && sj<=qj) return tree[i];
//         int mid=(si+sj)/2;
//         int left=getMaxUtil(arr,2*i+1,si,mid,qi,qj);
//         int right=getMaxUtil(arr,2*i+2,mid+1,sj,qi,qj);
//         return Math.max(left,right);

//     }

//     static void update(int arr[],int idx,int val){
//         arr[idx]=val;
//         int n=arr.length;
//         updateUtil(0,0,n-1,idx,val);
//     }

//     static void updateUtil(int i,int si,int sj,int idx,int val){
//         if(idx<si || idx>sj) return ;
//         if(si==sj) tree[i]=val;
//         else{
//             tree[i]=Math.max(tree[i],val);
//             int mid=(si+sj)/2;
//             updateUtil(2*i+1,si,mid,idx,val);
//             updateUtil(2*i+2,mid+1,sj,idx,val);
//         }
//     }
//     public static void main(String args[]){
//         int arr[]={6,8,-1,2,17,1,3,2,4};
//         int n=arr.length;
//         init(n);
//         buildSt(arr,0,0,n-1);
//         System.out.println(Arrays.toString(tree));
//         System.out.println(getMax(arr,2,5));
//         update(arr, 2, 20);
//         System.out.println(getMax(arr,2,5));
//     }

    
// }


public class WarshallAlgorithm {
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 0, 0},
            {0, 0, 0, 1},
            {1, 0, 0, 0},
            {0, 0, 1, 0}
        };
        int[][] transitiveClosure = computeTransitiveClosure(graph);
        for (int i = 0; i < transitiveClosure.length; i++) {
            for (int j = 0; j < transitiveClosure[0].length; j++) {
                System.out.print(transitiveClosure[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] computeTransitiveClosure(int[][] graph) {
        int numVertices = graph.length;
        int[][] closure = new int[numVertices][numVertices];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                closure[i][j] = graph[i][j];
            }
        }
        for (int k = 0; k < numVertices; k++) {
            for (int i = 0; i < numVertices; i++) {
                for (int j = 0; j < numVertices; j++) {
                    closure[i][j] = closure[i][j] | (closure[i][k] & closure[k][j]);
                }
            }
        }
        return closure;
    }
}
