import java.io.*;
import java.util.*; 

class asg {
    public int[] asteroidCollision(int[] a) {
        List<Integer> al=new ArrayList<>();
        al.add(a[0]);
        for(int i=1;i<a.length;i++){
            al.add(a[i]);
        
        int j=al.size()-1;
        while(j>0 && ((al.get(j)<0 && al.get(j-1)>0))){
            int f=al.remove (al.size()-1);
            int s=al.remove(al.size()-1);
            if(Math.abs(f)==Math.abs(s)) {
            j=j-2;
            continue;  
            }
            else if(Math.abs(f)>Math.abs(s)){
                j--;
                al.add(f);
            }
            else {
                j--;
                al.add(s);
                
            }
        }
        }
        int [] res=new int[al.size()];
        for(int i=0;i<al.size();i++){
            res[i]=al.get(i);
        }
        return res;
    }

    public int calBaseBallGamePoints(String[] str) {
        Stack<Integer> st=new Stack<>();
        int i=0;
        while(i<str.length){
            if(str[i].equals("+")){
                int sum=0;
                int  a=0,b=0;
                if(!st.empty()){
                    a=st.pop();
                    if(!st.empty()){
                        b=st.pop();
                    }
                    
                    sum+=(a+b);
                    st.push(b);
                    st.push(a);
                    st.push(sum);
                    
                }
            }
            else if(str[i].equals("D")){
                
                st.push(st.peek()*2);
            }
            else if(str[i].equals("C")){
                st.pop();

            }
            else{
                st.push(Integer.parseInt(str[i]));
            }
            i++;
        }
        int sum=0;
        while(!st.empty()){
            sum+=st.pop();
        }
        return sum;
        
    }

    public static String decodeString(String s) {
        Stack <Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!=']') st.push(ch);
            else if(ch==']'){
                StringBuilder sb=new StringBuilder();
                while(!st.empty() && st.peek()!='['){
                    sb.append(st.pop());
                }
                st.pop();
                int k=0;
                int base=1;
                while(!st.empty() && Character.isDigit(st.peek())){
                    k=(Character.getNumericValue(st.pop())*base)+k;
                    base*=10;
                }
                while(k-->0){
                    for(int i=sb.length()-1;i>=0;i--){
                        st.push(sb.charAt(i));
                    }
                }
            }
        }
        char res[]=new char[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return new String(res);
    }


    public int[] dailyTemperatures(int[] temperatures) {

        int length = temperatures.length;
        int hottest= Integer.MIN_VALUE;
        int[] ans = new int[length];
        for(int i=length-1;i>=0;i--){
        if(temperatures[i]>=hottest){
                hottest=temperatures[i];
        }
    else{
            int index = i+1;
    while(temperatures[i]>=temperatures[index]){
        index+=ans[index];
    }
    ans[i]=index-i;
}
        }
        return ans;
        
    }

        
    
	public static void main(String[] args){
        int []a = {10,2,-5};
        System.out.println("The desired output is : ");
        String str=" ";
        str.e
        
        int []arr = asteroidCollision(a);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
	}
}