

import java.util.Stack;
import java.util.*;

public class validparentheisappbetter {
    static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        char a[]=s.toCharArray();
        for(char ele: a){
            if(ele=='['|| ele=='{'|| ele=='(') {
                stack.push(ele);
                continue;
            }
            else if(stack.empty()) return false;
            char ch=stack.pop();
            if(ch=='[' && ele!=']') return false;
            else if(ch=='{'&& ele!='}') return false;
            else if(ch=='('&& ele!=')') return false;
        }
        return (stack.empty()==true);

    }
    class Solution {
        public boolean isValid(String s) {
            int[] stack = new int[s.length()];
            int top = -1;
            for (char c : s.toCharArray()) {
                if (c == ')' || c == '}' || c == ']') {
                    if (top != -1) {
                        if ((c == ')' && stack[top] == '(') 
                         || (c == '}' && stack[top] == '{') 
                         || (c == ']' && stack[top] == '[')) {
                            top--;
                        }
                        else {
                            return false;
                        }
                    }
                    else {
                        return false;
                    }
                } else {
                    stack[++top] = c;
                }
            }
            return top == -1;
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s));

    }
}
