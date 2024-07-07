import java.util.ArrayList;
import java.util.LinkedList;

public class collect {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        ll1.add(4);
        ll1.add(5);
        System.out.println(ll1);
        ll1.add(2,10);
        System.out.println(ll1);
        System.out.println(ll1.peek());
        System.out.println(ll1);
        System.out.println(ll1.poll());
        System.out.println(ll1);

    }
}
