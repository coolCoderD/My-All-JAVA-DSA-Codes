import java.util.Arrays;

public  class heapsort {

    // // ascending
    // public static void heapify(int a[],int i,int size){
    //     int max=i;
    //     int l=2*i+1;
    //     int r=2*i+2;


    //     if(l<size && a[l]>a[max]) max=l;
    //     if(r<size && a[r]>a[max]) max=r;


    //     if(max!=i){
    //         int t=a[i];
    //         a[i]=a[max];
    //         a[max]=t;

    //         heapify(a,max,size);
    //     }
    // }


    // //descending

    // // public static void heapify(int a[],int i,int size){
    // //     int min=i;
    // //     int l=2*i+1;
    // //     int r=2*i+2;

    // //     if(l<size && a[l]<a[min]) min=l;
    // //     if(r<size && a[r]<a[min] ) min=r;



    // //     if(min!=i){
    // //         int t=a[i];
    // //         a[i]=a[min];
    // //         a[min]=t;

    // //         heapify(a,min,size);
    // //     }
    // // }


    // public static void heapSort(int arr[]){  //TC= 2nlogn= O(logn)

    //     //Step 1 - build maxheap
    //     int n=arr.length;
    //     for(int i=n/2;i>=0;i--){
    //         heapify(arr,i,n);   //O(n/2*logn)
    //     }


    //     //Step 2 - push largest at end
    //     for(int i=n-1;i>0;i--){
    //         int temp=arr[0];
    //         arr[0]=arr[i];       //O(nlogn)
    //         arr[i]=temp;
    //         heapify(arr,0,i);
    //     }


    // }


    // public static void main(String []args){
    //     int arr[]={4,65,43,34,13,3242,889,90,56};
    //     heapSort(arr);
    //     System.out.println(Arrays.toString(arr));
    // }

    static class Heap{
        private  void heapify(int a[],int i,int size){
            int min=i;
            int l=2*i+1;
            int r=2*i+2;
            
            if(l<size && a[min]>a[l]) min=l;
            if(r<size && a[min]>a[r]) min=r;
            
            if(i!=min){
                int t=a[min];
                a[min]=a[i];
                a[i]=t;
                
                heapify(a,min,size);
            }
        }
        
        
        public  void heapSort(int a[]){
            int n=a.length;
            
            for(int i=n/2;i>=0;i--){
                heapify(a,i,n);
            }
            
            for(int i=n-1;i>0;i--){
                int t=a[0];
                a[0]=a[i];
                a[i]=t;
                
                heapify(a,0,i);
            }
        }
    }
    
    public static void main(String []args){
        int a[]={4,65,43,34,13,3242,889,90,56};
        Heap h=new Heap();
        h. heapSort(a);
        System.out.println(Arrays.toString(a));
    }
}
