package Sorting;
import java.util.*;

public class Main {
    public static int  LowerBound(int a[],int x){
        int high=a.length-1,low=0,result=-1;
        while(high>=low) {
            int mid=low+(high-low)/2;
            if(a[mid]==x){
                result = mid;
                high=mid-1;
            }
            else if(a[mid]>x) high=mid-1;
            else low=mid+1;
        }
        return result;
    }
   

   public static void main(String[] args){
        int x;
        Scanner sc=new Scanner(System.in);
     i nt n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
     }
     x=sc.nextInt();
     System.out.print(LowerBound(a,x));   
       
   }
    
}
