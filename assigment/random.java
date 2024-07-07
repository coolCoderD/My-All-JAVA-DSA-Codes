import java.util.*;

private class ki{

}


public class random {
    public static  int fib(int n)
    {
        if(n==0 || n==1) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n+"th fibbonacci is "+fib(n));
        
    }//write a code to create 1D array
}
