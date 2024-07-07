package Sorting;

import java.util.*;

public class SortAlgos {
    public static void BubbleSorting(int a[]){
        int n=a.length;
        
        for(int i=0;i<n-1;i++){
            int f=0;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    f=1;
            }
            
            }
            if(f==0) break;
            
        }
    
        }
    public static void InserationSort(int a[]){
        for(int i=1;i<a.length;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int t=a[j];
                a[j]=a[j-1];
                a[j-1]=t;
                j--;
            }
        }
    }


    public static void SelectionSort(int a[]){
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]) min=j;
            }
            if(min!=i){
                int t=a[min];
                a[min]=a[i];
                a[i]=t;
            }
        }
    }

    public static void SelectionSortReverse(int a[]){
        for(int i=a.length-1;i>=0;i--){
            int max=i;
            for(int j=i-1;j>=0;j--){
                if(a[j]>a[max]) max=j;
            }
            if(max!=i){
                int t=a[max];
                a[max]=a[i];
                a[i]=t;
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        SelectionSortReverse(a);
        System.out.println(Arrays.toString(a));


    }
}
