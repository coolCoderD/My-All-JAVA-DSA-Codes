import java.util.*;

public class ratinamaze {
    static int countPaths(int a[][],int n){
        if(a[0][0]== -1 || a[n-1][n-1]==-1) return 0;

        for(int i=1;i<n;i++){
            if(a[0][i]==0) a[0][i]=1;
            else break;
        }
        for(int i=0;i<n;i++){
            if(a[i][0]==0) a[i][0]=1;
            else break;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(a[i][j]==-1) continue;
                if(a[i-1][j]>0) a[i][j]+=a[i-1][j];
                if(a[i][j-1]>0) a[i][j]+=a[i][j-1];
                
            }
        }
        return a[n-1][n-1];
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println(countPaths(a,n));
    }
}



