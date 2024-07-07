


import java.util.*;

public class twosum {
    static int[] twoSum(int nums[],int target){
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++) hm.put(nums[i],i);
        int res[]=new int[2];
        res[0]=-1;
        res[1]=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && hm.containsKey(0)){
                res[0]=i;
                res[1]=hm.get(0);
                break;
            }
            else if(hm.containsKey(target-nums[i])){
                if(hm.get(target-nums[i])>i){
                    res[0]=i;
                    res[1]=hm.get(target-nums[i]);
                    break;
                }
            }
        }
        // System.out.println();
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int res[]=new int [2];
        res=twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
