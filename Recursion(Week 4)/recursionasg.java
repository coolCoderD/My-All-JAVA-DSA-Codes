import java.util.*;

public class recursionasg {
    static int SumOfDigits(int n){
        if(n>=0 && n<=9) return n;
        return n%10+SumOfDigits(n/10);
    }
    static int  AlternateSum(int n){
        if(n==1) return n;
        if(n%2==0) return AlternateSum(n-1)-n;
        else return AlternateSum(n-1)+n;

    }

    static int MaxInArray(int a[],int i){
        if(i==a.length-1) return a[i];
        if(a[i]>MaxInArray(a,i+1)) return a[i];
        else return MaxInArray(a,i+1);
    }

    static int SumOfArray(int a[],int i){
        if(i==a.length-1) return a[i];
        return a[i]+SumOfArray( a,i+1);
    }

    static int ArmstrongCheck(int n){
        if(n>=0 && n<=9) return n*n*n;
        int a=n%10;
        int r=a*a*a;
        return r+ArmstrongCheck(n/10);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(AlternateSum(n));
        


    }
    
}
