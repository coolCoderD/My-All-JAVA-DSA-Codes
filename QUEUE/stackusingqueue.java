import java.util.*;

class MyStack {

    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        if(q1.isEmpty()) {
            q1.add(x);
            return;
        }
        else{
            while(!q1.isEmpty()){
                q2.add(q1.poll());
            }
            q1.add(x);
            while(!q2.isEmpty()){
                q1.add(q2.poll());
            }
            return;
        }

        
    }
    
    public int pop() {
        if(q1.isEmpty()) return -1;
        else return q1.poll();
        
    }
    
    public int top() {
        if(q1.isEmpty()) return -1;
        else return q1.peek();
        
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

public class stackusingqueue  extends MyStack{
    public static void main(String[] args) {
        MyStack st=new MyStack();
        st.push(34);
        st.push(45);
        System.out.println(st.top());
    }
    
}
