import java.util.Arrays;

public class basicarr {
    static void changeArr(int arr[],int i,int v){  //TC:O(n)  SC(stack):O(n)
        if(i==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        arr[i]=v;
        changeArr(arr,i+1,v+1); //fuction call step
        arr[i]-=2; //backtracking step
    }


    public static void main(String args[]){
        int arr[]=new int[5];
        changeArr(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
    
}
