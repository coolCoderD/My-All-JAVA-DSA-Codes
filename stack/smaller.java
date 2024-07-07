import java.util.*;


public class smaller {

    public static void previousSmaller(int a[]){
        int i=a.length-1;
        Stack<Integer> st=new Stack<>();
        int res[]=new int [a.length];
        for(;i>=0;i--){
            while(!st.empty() && a[st.peek()]>a[i])  res[st.pop()]=i;
            st.push(i);
        }
        while(!st.empty()) res[st.pop()]=-1;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(res));
    }
    public static void nextSmaller(int a[]){
        Stack<Integer> st=new Stack<>();
        int res[]=new int [a.length];
        for(int i=0;i<a.length;i++){
            while(!st.empty() && a[st.peek()]>a[i]) res[st.pop()]=i;
            st.push(i);
        }
        while(!st.empty()) res[st.pop()]=a.length;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(res));
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        previousSmaller(a);
        nextSmaller(a);
    }
}
