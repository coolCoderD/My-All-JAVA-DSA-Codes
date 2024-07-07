import java.util.Arrays;

public class quicksort {
    public static void QuickSort(int arr[],int l,int h){
        if(l<h){
            int m=parition(arr,l,h);
            QuickSort(arr,l,m-1);
            QuickSort(arr,m+1,h);
        }
    }
    public  static int parition(int arr[],int l,int h){
        int i=l;
        int r=l+(int)Math.random()%(h-l+1);
        int t=arr[r];
        arr[r]=arr[l];
        arr[l]=arr[r];
        int pivot=arr[l];
        for(int j=i+1;j<arr.length;j++){
            if(pivot>=arr[j]){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[i];
        arr[i]=arr[l];
        arr[l]=temp;


        
        return i;
    }
    public static void main(String [] args){
        int arr[]={5,4,3,34,2,1};
        System.out.println(Arrays.toString(arr));
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
