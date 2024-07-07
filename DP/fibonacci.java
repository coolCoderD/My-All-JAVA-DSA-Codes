

public class fibonacci {

    //notes :- konsi aaray leni h yh depend krta h kinte variable change ho rhe h 
    //agar 1 var change ho rhe h to 1D arary 2 var change ho rhe h to 2D array and so on
    //meaning  of index initalization or kya niklana h isse pta chl jata h 



    public static int fib(int n,int f[]){   //memoization
        if(n==0 || n==1) return n;         //O(n)
        if(f[n]!=0) return f[n];
        f[n]=fib(n-1,f)+fib(n-2,f);
        return f[n];
    }


    static int fibTab(int n){   //tabular O(n)
        int dp[]=new int[n+1];
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }


    //Climbing Stairs


    //Recursion
    static int ways(int n,int dp[]){
        if(n==0 || n==1) return 1;
        if(n<0) return 0;              //memoziation
        if(dp[n]!=0) return dp[n];
        dp[n]=ways(n-1,dp)+ways(n-2,dp);
        return dp[n];
    }

    //Tabulation
    public static int countWays(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }



    public static void main(String []args){
        int n=5;
        int dp[]=new int[n+1];
        dp[0]=1;
        System.out.println(ways(n,dp));
        System.out.println(countWays(7));
    }
}
