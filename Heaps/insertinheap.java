

public class insertinheap {
    public static void swap(int a[],int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    public static void heapify(int a[],int n,int i){
        int parent=(i-1)/2;
        if(a[parent]>0){
            if(a[i]>a[parent]){
                swap(a,i,parent);
                heapify(a,n,parent);
            }
        }
    }



    public static int insert(int a[],int n,int k){
        n++;
        a[n-1]=k;
        heapify(a, n, n-1);
        return n;
    }



    public static void printArray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }



    //Deletion in a heap 

    public static void heapify2(int a[],int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;

        if(l<n && a[largest]<a[l]){
            largest=l;
        }
        if(r<n && a[largest]<a[r]){
            largest=r;
        }


        if(i!=largest){
            swap(a,i,largest);
            heapify2(a,n,largest);
        }
    }



    public static int delete(int a[],int n){
        a[0]=a[n-1];
        n--;
        heapify2(a,n,0);
        return n;

    }



    public static void main(String []args){
        int a[]=new int[100];
        a[0] = 100;
        a[1] = 70;
        a[2] = 60;
        a[3] = 40;
        a[4] = 50;
        int n=5;

        printArray(a,n);
        n=delete(a,5);
        printArray(a, n);


    }
}
