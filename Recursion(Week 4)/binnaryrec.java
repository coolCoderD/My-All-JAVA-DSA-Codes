import java.util.Scanner;

public class binnaryrec {
    public static int binary(int a[],int l,int h,int x){
        if(h>=l){
            int m=l+(h-l)/2;
            if(a[m]==x) {
                return m;
            }
            if(a[m]<x) {
                return binary(a,m+1,h,x);
            }
            else {
                return  binary(a,l,m-1,x);
            }
        }
        return -1;
    }

    public static void main(String [] args){

        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int a[]=new int[n];
        // for(int i=0;i<n;i++) {
        //     a[i]=sc.nextInt();
        // }
        // int x=sc.nextInt();
        int n=7;
        int a[]={1,2,3,4,5,6,7};
        int x=3;
        System.out.println(binary(a,0,n-1,x));

    }
}
