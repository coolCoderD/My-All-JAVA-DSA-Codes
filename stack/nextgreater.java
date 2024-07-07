

import java.util.Scanner;
import java.util.Stack;

import java.util.Arrays;
import java.util.Stack;

public class nextgreater {
    static void nextGreaterEle(int a[]) {
        int n = a.length;
        int res[] = new int[n];
        int i = 0;
        Stack<Integer> st = new Stack<>();

        while (i < n) {
            while (!st.empty() && a[i] > a[st.peek()]) {
                int idx = st.pop();
                res[idx] = a[i];
                }
                st.push(i);
            
            i++;
        }
        while(!st.empty()){
            int idx=st.pop();
            res[idx]=-1;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(res));
    }
    

    



    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        nextGreaterEle(a);
    }
}

    
    

