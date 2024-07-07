import java.security.PublicKey;
import java.util.Scanner;

public class asg2darray {

    public static  void Que1_FindDifferentTypesOfElements(int [][]a){
        int p=0,n=0,o=0,e=0,zero=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]%2==0) e++;
                if(a[i][j]%2!=0) o++;
                if(a[i][j]>0) p++;
                if(a[i][j]<0) n++;
                if(a[i][j]==0) zero++;
            }
        }
        System.out.print("Positive Numbers: "+p);
        System.out.println();
        System.out.print("Negative Numbers: "+n);
        System.out.println();
        System.out.print("Odd Numbers: "+o);
        System.out.println();
        System.out.print("Even Numbers: "+e);
        System.out.println();
        System.out.println("Number of zeros: "+zero);

    }


    public static void Que2_ElementsAboveTheDiagonal(int [][]a){
        int size=a.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if( i+j<=size/2) System.out.print(a[i][j]+" ");
            }
        }
        
    }

    public static void Que3_ElementsInDiagonals(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(i==j || i+j==((a.length+1)/2) ) System.out.print(a[i][j]);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }


    public  static void Que4_LargestElement(int a[][]){
        int max=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]>max) max=a[i][j];
            }
        }
        System.out.println("Largest Element is: "+max);
    }


    public static void Que5_MiddleElements(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==(n)/2 || i==(n)/2) System.out.print(a[i][j]+" ");
            }
        }
    }


    public static void main(String[] args) {
        int r,c;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        Que2_ElementsAboveTheDiagonal(a);
        //Create 2d array

        
    }
}
