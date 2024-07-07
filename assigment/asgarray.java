import java.util.Scanner;
import java.util.*;

public class asgarray {


    public static void  Que1_SumOfElementsPresentAtEvenIndcies(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0) sum+=a[i];
        }
        System.out.println("Required Sum Is: "+sum);
    }

    public static void Que2_ForEachLoopAllEvenElements(int a[]){
        System.out.println("Even Elements Are: ");
        for(int e:a){
            if(e%2==0) System.out.print(e+" ");
        }
    }


    public static void Que3_MaxElemnt(int a[]){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max Element is: "+max);
    }

    public static void Que4_SecondLargest(int a[]){
        int max,max2;
        if(a[0]>a[1]){
            max=a[0];
            max2=a[1];
        }
        else{
            max2=a[0];
            max=a[1];
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max2=max;
                max=a[i];
                
            }
            else if(a[i]>max2){
                max2=a[i];
            }
        }
        System.out.println("Second Largest Element is: "+max2);
    }


    public static void Que5_PeakElement(int a[]){
        int n=a.length;
        for(int i=1;i<n-1;i++){
            if(a[i]>a[i-1] && a[i]>a[i+1]){
                System.out.println(a[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Start entering the element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Que5_PeakElement(a);
        sort(a,a+n);
        
    }
}
