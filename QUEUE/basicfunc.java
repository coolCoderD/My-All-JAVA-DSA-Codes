
import java.util.*;
public class basicfunc {
    public static void main(String [] args){
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<10;i++) q.add(i);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}
