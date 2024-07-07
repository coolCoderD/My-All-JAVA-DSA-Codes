class MyQueue {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();
public MyQueue() {

}

public void push(int x) {
    st1.push(x);
}

public int pop() {
    if(st1.empty()){
        return -1;
    }
    while(!st1.empty()){
        st2.push(st1.pop());
    }
    int x= st2.pop();
    while(!st2.empty()){
        st1.push(st2.pop());
    }
    return x;

}

public int peek() {
    if(st1.empty()) return -1;
    while(!st1.empty()){
        st2.push(st1.pop());
    }
    int x= st2.peek();
    while(!st2.empty()){
        st1.push(st2.pop());
    }
    return x;
}

public boolean empty() {
    return st1.empty();
    
}
}

/**
* Your MyQueue object will be instantiated and called as such:
* MyQueue obj = new MyQueue();
* obj.push(x);
* int param_2 = obj.pop();
* int param_3 = obj.peek();
* boolean param_4 = obj.empty();
*/

public class queueusingstack extends MyQueue {
    public static void main(String[] args) {
        
    }
    
}
