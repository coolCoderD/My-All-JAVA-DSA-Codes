import java.util.*;

public class mergeSort {
    // public static void mergeSort(int []arr,int i,int j){
    //     if(i<j){
    //         int mid=i+(j-i)/2;
    //         mergeSort(arr, i, mid);
    //         mergeSort(arr,mid+1,j);
    //         mergeProcedure(arr,i,mid,j);
    //     }
    //     return;
    // }


    // public static void mergeProcedure(int arr[],int l,int mid,int r){
    //     int i,j,k;
    //     int n1=mid-l+1;
    //     int n2=r-mid;
    //     int left[]=new int[n1];
    //     int right[]=new int[n2];

    //     for(i=0;i<n1;i++) left[i]=arr[l+i];
    //     for(j=0;j<n2;j++) right[j]=arr[mid+1+j];
    //     i=0;
    //     j=0;
    //     k=l;
    //     while(i<n1 && j<n2){
    //         if(left[i]<right[j]) arr[k++]=left[i++];
    //         else arr[k++]=right[j++];
    //     }
    //     while(i<n1) arr[k++]=left[i++];
    //     while(j<n2) arr[k++]=right[j++];
    // }


    // public static void main(String [] args){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int arr[]=new int [n];
    //     for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    //     System.out.println(Arrays.toString(arr));
    //     mergeSort(arr, 0, n-1);
    //     System.out.println(Arrays.toString(arr));
    // }

    public static void mergeSort(int arr[],int l,int h){
        if(h>l){
            int m=l+(h-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,h);
            merge(arr,l,m,h);
        }
        return ;
    }
    
    public static void merge(int arr[],int l,int m,int h){
        int l1=m-l+1;
        int l2=h-m;
        
        int a[]=new int[l1];
        int b[]=new int[l2];
        
        int i=0,j=0,k=l;
        
        for(i=0;i<l1;i++) a[i]=arr[l+i];
        
        for(j=0;j<l2;j++) b[j]=arr[m+1+j];
        
        
        i=0;
        j=0;
        
        while(i<l1 && j<l2){
            if(a[i]<b[j]){
                arr[k++]=a[i++];
            }
            else arr[k++]=b[j++];
        }
        
        while(i<l1) arr[k++]=a[i++];
        while(j<l2) arr[k++]=b[j++];
        
        
    }

     public static void main(String []args){
         
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        Random r=new Random();
        for(int i=0;i<n;i++){
            int no=r.nextInt(100)+1;
            arr[i]=no;
        }
        long start=System.nanoTime();
        mergeSort(arr,0,n-1);
        long end=System.nanoTime();
        long exe=end-start;
        System.out.println("Execution time: "+exe+" nanoseconds");
        System.out.println(Arrays.toString(arr));
        
    }
}
