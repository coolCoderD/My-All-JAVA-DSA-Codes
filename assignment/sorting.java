// package assignment; 

import java.util.*;

public class sorting {
    static void Que1_BubbleSortingReverse(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            int f=0;
            for(int j=0;j<n-i-1;j++){
                if(a[j]<a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    f=1;
                }
            }
            if(f==0) break;
        }
    }


    static void Que2_SelectionSortingReverse(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            int max=i;
            for(int j=i+1;j<n;j++){
                if(a[j]>a[max]) max=j;
            }
            if(max!=i){
                int t=a[max];
                a[max]=a[i];
                a[i]=t;
            }
        }
        
    }


    static void Que3_InsertionSortingReverse(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && a[j]>a[j-1]){
                int t=a[j];
                a[j]=a[j-1];
                a[j-1]=t;
                j--;
            }
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Que2_SelectionSortingReverse(a);
        System.out.println(Arrays.toString(a));
    }
}
