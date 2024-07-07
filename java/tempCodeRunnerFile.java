import java.util.ArrayList;

public class collection {
    public static void main(String[] args) {
        
    
    ArrayList al1=new ArrayList();

    al1.add(50);
    al1.add(90);
    al1.add(70);
    System.out.println(al1);
    al1.add(1,6);
    System.out.println(al1);
    System.out.println(al1.contains(6));
    System.out.println(al1.size());
    System.out.println(al1.indexOf(6));
    al1.clear();
    System.out.println(al1);


    }
