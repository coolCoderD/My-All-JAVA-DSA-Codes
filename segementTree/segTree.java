

public class segTree {
    static int tree[];
    //Creation............
    public static void  init(int n){
        tree=new int[4*n];
    }

    public static int   buildSt(int a[],int  i,int start,int end){  //O(n)
        if(start==end){
            tree[i]=a[start];
            return a[start];
        }

        int mid=(start+end)/2;
        buildSt(a,2*i+1,start,mid);
        buildSt(a,2*i+2,mid+1,end);
        tree[i]=tree[2*i+1]+tree[2*i+2];
        return tree[i];
    }

    //Query.............
    static int getSumUtil(int a[],int i,int si,int sj,int qi,int qj){
        if (si >= qi && sj <= qj) {
            return tree[i];
        }
        if (sj < qi || si > qj) {
            return 0;
        }

        else{
        int mid=(si+sj)/2;
        int left=getSumUtil(a, 2*i+1, si, mid, qi, qj);
        int right=getSumUtil(a,2*i+2,mid+1,sj,qi,qj);
        return left+right;
        }
    }

    public static int getSum(int a[],int qi,int qj){
        int n=a.length;
        return getSumUtil(a,0,0,n-1,qi,qj);
    }


    //Update

    static void updateUtil(int i,int si,int sj,int idx,int diff){ //O(logn)
        if(idx>sj || idx<si) return ;
        tree[i]+=diff;
        if(si==sj) return;
        int mid=(si+sj)/2;
        updateUtil(2*i+1,si,mid,idx,diff);
        updateUtil(2*i+2, mid+1, sj, idx, diff);
    }

    static void update(int arr[],int idx,int newVal){
        int n=arr.length;
        int diff=newVal-arr[idx];
        arr[idx]=newVal;
        updateUtil(0,0,n-1,idx,diff);
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        buildSt(arr,0,0,n-1);

        for(int i=0;i<tree.length;i++){
            if(tree[i]==0) break;
            System.out.print(tree[i]+" ");
        }

        System.out.println(getSum(arr, 2, 5));
        System.out.println();

        update(arr, 2, 2);


        System.out.println(getSum(arr, 2, 5));

        for(int i=0;i<tree.length;i++){
            if(tree[i]==0) break;
            System.out.print(tree[i]+" ");
        }
    }

    
}
