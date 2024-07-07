public class catalanNumber {
    static int cat(int n,int dp[]){
        if(n==0 || n==1) return 1;
        if(dp[n]!=0) return dp[n];
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=cat(i,dp)*cat(n-i-1,dp);
        }
        return dp[n]=ans;
    }

    static int catTab(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }

    
    
    public static void main(String args[]){
        int n=5;
        int dp[]=new int[n+1];
        System.out.println(catTab(n));
    }
}
