// package assignment;
import java.util.*;

public class numbersystem {
    static void Que1_ConverToBinary(int n){

        if(n==1) {
            System.out.print(1);
            return ;
        }
        Que1_ConverToBinary(n/2);
        System.out.print(n%2);
    }

    static boolean Que2_IsPowerOfTwo(int n){
        if(n<=0) return false;
        else{
            while(n>1){
                if(n%2!=0) return false;
                n/=2;
            }
            return true;
        }
    }

    static void Que3_EvenOddCheck(int x){
        if((x&1)==0) System.out.println(x+" is an even number");
        else System.out.println(x+" is an odd number");
    }

    static void Que4_CountSetBits(int x){
        int c=0;
        while(x!=0){
            c+=x & 1;
            x>>=1;
        }
        System.out.println(c);
    }
    static int Que5_FindOdd(int arr[]) {
        int result = 0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            result ^= arr[i];
        }
        return result;
    }    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();


    }
}
