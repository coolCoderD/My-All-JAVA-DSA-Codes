import java.util.Scanner;

public class powerof {
    static int Powerof(int a,int b){
        if(b==1) return a;
        return a*Powerof(a,b-1);
    }
    public static void main(String[]args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(Powerof(a,b));
    }
}
