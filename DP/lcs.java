import java.util.*;


public class lcs {
    //Longest Common Subsequence 
    static int lcsRec(String s1,int n,String s2,int m){
        if(n==0 || m==0) return 0;
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return 1+lcsRec(s1,n-1,s2,m-1);
        }
        else {
            int ans1=lcsRec(s1,n-1,s2,m);
            int ans2=lcsRec(s1,n,s2,m-1);
            return Math.max(ans1,ans2);
        }
    }

        static int lcsmem(String s1,int n,String s2,int m,int dp[][]){
        if(n==0 || m==0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            dp[n][m]=1+lcsmem(s1,n-1,s2,m-1,dp);
            return dp[n][m];
        }
        else {
            int ans1=lcsmem(s1,n-1,s2,m,dp);
            int ans2=lcsmem(s1,n,s2,m-1,dp);
            dp[n][m]=Math.max(ans1,ans2);
            return dp[n][m];
        }
    }

    public  static int lcsTab(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        return dp[n][m];
        
    }


    //Substring
    static int subsString(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        int max=Integer.MIN_VALUE;


        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    if(max<dp[i][j]) max=dp[i][j];
                }
                else dp[i][j]=0;
            }
            
        }
        return max;
    }



    //longest Increasing Subsequence
    static int lis(int arr1[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++) set.add(arr1[i]);
        int arr2[]=new int[set.size()];
        int i=0;

        for(int num:set){
            arr2[i]=num;
            i++;
        }

        Arrays.sort(arr2);
        return lcs(arr1,arr2);
    }



    static int lcs(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int dp[][]=new int [n+1][m+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][m];

    }



    //Edit Distance
    static int editDistance(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<dp.length;i++) dp[i][0]=i;
        for(int j=0;j<dp[0].length;j++) dp[0][j]=j;

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]; //jinta choti prblm ko legege operation unti hi bdi ko b legege 
                }
                else{
                    dp[i][j]=Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1])+1;
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String []args){
        // String s1="abcde";
        // String s2="abc";
        // int n=s1.length();
        // int m=s2.length();
        // int dp[][]=new int [n+1][m+1];

        // for(int i=0;i<n+1;i++){
        //     for(int j=0;j<m+1;j++){
        //         dp[i][j]=-1;
        //     }
        // }

        // System.out.println(subsString(s1, s2));

        // int arr1[]={5,3,10,7,40,80};
        // System.out.println(lis(arr1));

        String s1="ABCBDAB";
        String s2="BDCAB";
        System.out.println(lcsTab(s1,s2));
    }
}
