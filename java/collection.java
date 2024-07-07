// import java.util.Iterator;
// import java.util.concurrent.*;

// // import java.util.ArrayList;
// // import java.util.Deque;
// // import java.util.Iterator;
// // import java.util.LinkedList;
// // import java.util.ListIterator;
// // import java.util.PriorityQueue;
// // import java.util.Scanner;
// // import java.util.TreeSet;

// // public class collection {
// //     public static void main(String[] args) {
// //         ArrayList al=new ArrayList();
// //         Scanner sc=new Scanner(System.in);
// //         for(int i=0;i<5;i++){
// //             System.out.println("enter: ");
// //             Object o=sc.nextInt();
// //             al.add(o);

// //         }
// //         // System.out.println(al);
// //         System.out.println("**************************************");
// //         // for(int i=0;i<al.size();i++){
// //         //     Object o=al.get(i);
// //         //     System.out.println(o);
// //         // }
// //         ListIterator itr=al.listIterator(al.size());
// //         while(itr.hasPrevious()){
// //             Integer i=(int)itr.previous();
// //             System.out.println(i);
            
// //         }

    


// //     }








import java.util.*;

class Employee
{
    private String name;
    private int empId;

    public Employee(String name, int empId)
    {
        this.name=name;
        this.empId=empId;
    }

    public String toString()
    {
        return empId + name ;
    }

   // @Override
    public void finalize()
    {
        System.out.println("clean up work  by GC before de allocating memoery from heap");

    }

    

}


public class collection
{
    public static void main(String[] args) 
    {

        Employee e=new Employee("Hyder", 171);


        WeakHashMap hm=new WeakHashMap();
        hm.put(e, "Hyder");
        System.out.println(hm);

        e=null;// eligible for garbage collection

        System.gc(); //invocking garbage collector

        System.out.println(hm);

        System.out.println("Last line");

      


       
        

        
    }
    
}
