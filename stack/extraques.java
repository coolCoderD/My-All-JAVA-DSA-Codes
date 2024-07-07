import java.util.*;

public class extraques {
    static void IncreasingAndDecreasing(String str){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=str.length();i++){
            st.push(i+1);
            if(i==str.length() || str.charAt(i)=='I') {
                while(!st.empty()) System.out.print(st.pop());
            }
        }
    }

    static int validSubarrays(int a[]) {
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[a.length];
        int[] right = new int[a.length];
    
        // Find the next smaller element on the right
        for (int i = 0; i < a.length; i++) {
            while (!st.empty() && a[st.peek()] > a[i]) {
                nse[st.pop()] = i;
            }
            st.push(i);
        }
        while (!st.empty()) {
            nse[st.pop()] = a.length;
        }
    
        // Calculate the number of valid subarrays
        int sum = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            sum+= nse[i] - i;
            // sum += right[i];
        }
        return sum;
    }
    



    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int result = validSubarrays(array);
        System.out.println("Number of valid subarrays: " + result);
    }
}

