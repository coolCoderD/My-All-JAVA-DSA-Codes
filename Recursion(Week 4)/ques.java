import java.math.BigInteger;
import java.util.*;

public class ques {
    public static void multiple(int a,int b){
        if(b==0) return;
        
        multiple(a,b-1);
        System.out.print(a*b+" ");
    }

    static BigInteger powerOf(BigInteger a,int b){
        BigInteger r,fr;
        if(b==1) return a;
        r=powerOf(a,b/2);
        fr=r.multiply(r);
        if(b%2==0) return fr;
        else return a.multiply(fr);

    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        BigInteger a=sc.nextBigInteger();
        int b=sc.nextInt();
        BigInteger result=powerOf(a,b);
        System.out.println(result);
        
    }
}
