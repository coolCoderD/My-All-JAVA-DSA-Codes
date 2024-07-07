

public class Backtracking {
    static void  findSubsets(String str,String ans,int i){  //TC:O(N*2^N)
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }


        //recursion

        //yes choice
        findSubsets(str, ans+str.charAt(i), i+1);

        //No choice
        findSubsets(str, ans, i+1);

    }

    public static void findPermutation(String str,String ans){ //TC:O(n*n!)
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            // abcde => ab + de = abde
            String Newstr=str.substring(0, i) + str.substring(i+1);  //removal of ith character
            findPermutation(Newstr, ans+curr);
        }

    }

    public static void main(String args[]){
        String str="abc";
        findSubsets(str, "", 0);
        findPermutation(str, "");
    }
    
}
