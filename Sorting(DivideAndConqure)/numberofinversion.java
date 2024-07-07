import java.util.*;

public class numberofinversion {
    public static int  inversionCount(int []arr,int l,int h){
        int count=0;
        if(l<h){
            int mid=l+(h-l)/2;
            count+=inversionCount(arr,l,mid);
            count+=inversionCount(arr,mid+1,h);
            count+=mergeProcedure(arr,l,mid,h);
        }
        return count;
    }

    public  static int mergeProcedure(int arr[],int l,int mid,int h){
        int swap=0;
        int [] left=Arrays.copyOfRange(arr, l,mid+1);
        int []right=Arrays.copyOfRange(arr,mid+1,h+1);
        int i=0,j=0,k=l;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
                swap+=(mid+1)-(l+i);
            }
        }
        while(i<left.length) arr[k++]=left[i++];
        while(j<right.length) arr[k++]=right[j++];
        return swap;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(Arrays.toString(a));
        System.out.println(inversionCount(a, 0, n-1));
        System.out.println(Arrays.toString(a));
        int ni=sc.nextInt();
        int arr[]=new int[ni];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println(inversionCount(arr, 0, ni-1));
        System.out.println(Arrays.toString(arr));
    }
}
