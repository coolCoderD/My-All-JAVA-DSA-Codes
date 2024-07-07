import java.util.Arrays;

public class kanpsack {




    static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    static int rec(int val[],int wt[],int W,int n){
        if(W==0 || n==0) return 0;

        if(wt[n-1]<=W){
            int ans1=val[n-1]+rec(val,wt,W-wt[n-1],n-1);
            int ans2=rec(val,wt,W,n-1);
            return Math.max(ans1,ans2);
        }
        else return rec(val,wt,W,n-1);

    }

    //memoziation
    static int mem(int val[],int wt[],int W,int n,int dp[][]){
        if(W==0 || n==0) return 0;
        if(dp[n][W]!=-1) return dp[n][W];

        if(wt[n-1]<=W){
            int ans1=val[n-1]+mem(val,wt,W-wt[n-1],n-1,dp);
            int ans2=mem(val,wt,W,n-1,dp);
            dp[n][W]=Math.max(ans1,ans2);
            return dp[n][W];
        }
        else{
            dp[n][W]=mem(val,wt,W,n-1,dp);
            return dp[n][W];
        }
    }


    //Tab
    public static int tab(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<dp.length;i++) dp[i][0]=0;
        for(int j=0;j<dp[0].length;j++) dp[0][j]=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v=val[i-1]; //ith item val
                int w=wt[i-1]; //ith item wt
                if(w<=j){
                    int incProfit=v+dp[i-1][j-w];
                    int excProfit=dp[i-1][j];
                    dp[i][j]=Math.max(incProfit,excProfit);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][W];
    }


    //Target Sum
    static boolean targetSumTab(int arr[],int sum){
        int n=arr.length;
        boolean dp[][]=new boolean[n+1][sum+1];

        //i-->items j-->target Sum
        for(int i=0;i<n+1;i++) dp[i][0]=true;

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                int v=arr[i-1];
                if(v<=j && dp[i-1][j-v]==true) dp[i][j]=true;
                else if(dp[i-1][j]==true) dp[i][j]=true;
            }
        }

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(dp[i][j]==true) System.out.print("T"+" ");
                else System.out.print("F"+" ");
            }
            System.out.println();
        }
        return dp[n][sum];
    }


    //Unbounded Knapsack
    static int unboundedKnapsack(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];

        for(int i=0;i<n+1;i++) dp[i][0]=0;
        for(int j=0;j<dp[0].length;j++) dp[0][j]=0;

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }


    //Coin Change 
    static int coinChange(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];
        
        // Initialize the dp array
        for (int j = 0; j < sum + 1; j++) dp[0][j] = 0;
        for (int i = 0; i < n + 1; i++) dp[i][0] = 1; // Change this line to dp[i][0] = 0;
    
        for (int i = 1; i <n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[n][sum];
    }
    

    //Rod Cutting
    public static int rodCutting(int length[],int price[],int rodlen){
        int dp[][]=new int[length.length+1][rodlen+1];

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(length[i-1]<=j){
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[length.length][rodlen];
    }


    //minimum partitioning O(nw)
    static int sum1(int a[],int w){
        int dp[][]=new int[a.length+1][w+1];

        for(int i=1;i<a.length+1;i++){
            for(int j=1;j<w+1;j++){
                if(a[i-1]<=j){
                    dp[i][j]=Math.max(a[i-1]+dp[i-1][j-a[i-1]],dp[i-1][j]);
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[a.length][w];

    }


    static int minDiff(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        int w=sum/2;
        int sum1=sum1(a,w);
        int sum2=sum-sum1;
        return Math.abs(sum2-sum1);
    }



    //min array jump
    static int jump(int a[]){
        int dp[]=new int[a.length];
        Arrays.fill(dp, 0, dp.length-1, -1);

        for(int i=a.length-2;i>=0;i--){
            int ans=Integer.MAX_VALUE;
            int steps=a[i];
            for(int j=i+1;j<=i+steps && j<a.length;j++){
                if(dp[j]!=-1){
                    ans=Math.min(ans,dp[j]+1);
                }
            }
            if(ans!=Integer.MAX_VALUE) dp[i]=ans;

        }
        for(int i=0;i<dp.length;i++){
            System.out.print(dp[i]+" ");
        }
        return dp[0];

    }
    
    public static void main(String []args){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int dp[][]=new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(unboundedKnapsack(val, wt, W));

        // int arr[]={1,2,3};
        // int sum=4;
        // System.out.println(coinChange(arr, sum));
        


        // int coins[]={2,5,3,6};
        // int sum=10;
        // System.out.println(coinChange(coins,sum));


        // int length[]={1,2,3,4,5,6,7,8};
        // int price[]={1,5,8,9,10,17,17,20};
        // int rodlen=8;
        // System.out.println(rodCutting(length, price, rodlen));

        // int a[]={1,6,11,5};
        // System.out.println(minDiff(a));

        // int a[]=new int[9];
        // Arrays.fill(a, 0, 8, -1);
        // for(int ele:a) System.out.println(ele);


        int a[]={2,3,1,1,4};
        System.out.println(jump(a));

    }
}
