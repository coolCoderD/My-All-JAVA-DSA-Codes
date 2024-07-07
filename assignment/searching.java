package assignment;
import java.lang.reflect.Field;
import java.util.*;

public class searching {

    static int   Que1_LinearSearch(int a[],int x){
        int n=a.length,result=-1;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                result=i;
                return result;
            }
        }
        return result;
    }


    
    static int BinaryFirst(int a[],int x){
        int low=0,high=a.length-1,result=-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(a[mid]==x){
                result=mid;
                high=mid-1;
            }
            else if(a[mid]<x) low=mid+1;
            else high=mid-1;
        }
        return result;
    }

    static int BinaryLast(int a[],int x){
        int high=a.length-1,low=0,result=-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(a[mid]==x){
                result=mid;
                low=mid+1;
            }
            else if(a[mid]<x) low=mid+1;
            else high=mid-1;
        }
        return result;

    }
    static int Que3_CountOne(int a[]){
        int first=BinaryFirst(a,1);
        int last=BinaryLast(a,1);
        if(first!=-1 && last!=-1){
            return last-first+1;
        }
        else return -1;
    }


    static int Que4_CountTarget(int a[],int x){
        int first=BinaryFirst(a,x);
        int last=BinaryLast(a,x);
        if(first!=-1 && last!=-1){
            return last-first+1;
        }
        else return -1;
    }


    static boolean Que5_PerfectSquare(int x){
        boolean f=false;
        int high=x,low=0;
        while(high>=low){
            int mid=low+(high-low)/2;
            long val=mid*mid;
            if(val==x) {
                f=true;
                return f;
            }
            else if(val<x) low=mid+1;
            else high = mid-1;
            }
            return f;
        }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int a[]=new int[n];
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        System.out.println("Enter the  number: ");
        int x=sc.nextInt();
        boolean ans=Que5_PerfectSquare(x);
        System.out.println(ans);

    }
}
