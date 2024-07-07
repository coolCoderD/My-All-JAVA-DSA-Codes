public class mcm {
    static int mcm(int a[],int i,int j){
        if(i==j) return 0;


        int ans=Integer.MAX_VALUE;

        for(int k=i;k<j;k++){
            int cost1=mcm(a,i,k);
            int cost2=mcm(a,k+1,j);
            int cost3=a[i-1]*a[k]*a[j];
            ans=Math.min(ans,cost3+cost1+cost2);
        }
        return ans;
    }

    static int mcmMemo(int a[],int i, int j,int dp[][]){
        if(i==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost1=mcmMemo(a,i,k,dp);
            int cost2=mcmMemo(a,k+1,j,dp);
            int cost3=a[i-1]*a[k]*a[j];
            ans=Math.min(ans,cost1+cost2+cost3);
        }
        return dp[i][j]=ans;
    }


    static int mcmTab(int a[]){
        int n=a.length;
        int dp[][]=new int[n][n];


        for(int i=0;i<n;i++){
            dp[i][i]=0;
        }
        for(int len=2;len<=n-1;len++){
            for(int i=1;i<=n-len;i++){
                int j=i+len-1;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int cost=dp[i][k]+dp[k+1][j]+(a[i-1]*a[k]*a[j]);
                    dp[i][j]=Math.min(dp[i][j],cost);
                }

            }
        }
        return dp[1][n-1];
    }

    public static void main(String[]args){
        int a[]={1,2,3,4,3};
        int n=a.length;
        int dp[][]=new int [n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(mcmMemo(a,1,a.length-1,dp));

        System.out.println();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.println(mcmTab(a));
    }
}
