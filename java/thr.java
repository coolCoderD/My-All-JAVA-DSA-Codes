import java.sql.Date;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.time.*;

// class Queue {
//     int x;
//     boolean flag=false;
//     synchronized  public void put (int j){
//         try{
//             if(flag==true){
//                 wait();
//             }
//             else{
//                 x=j;
//                 System.out.println("I have produce  value x"+x);
//                 flag=true;
//                 notify();
//             }


//         }
//         catch(Exception e){
//             System.out.println("Problem");
//         }


//     }
//     synchronized void get (){

//         try{
//             if(flag == false){
//                 wait();
//             }
//             else{
//                 System.out.println("I have consumed  value x"+x);
//                 flag=false;
//                 notify();
//             }
            
//         }
//         catch(Exception e){
//             System.out.println("Some problem");
//         }

//     }
// }


// class Producer extends Thread{
//     Queue q;
//     Producer(Queue b){
//         q=b;
//     }
//     public void run(){
//         int i=1;
//         while(true){
//         q.put(i++);
//         }
//     }

// }




// class Consumer extends Thread{
//     Queue q;
//     Consumer(Queue a){
//         q=a;

//     }
//     public void run(){
//         while(true){
//             q.get();

//         }

//     }
    

// }



// public class thr {
//     public static void main(String[] args) {
//         Queue q=new Queue();
//         Producer p=new Producer(q);
//         Consumer c=new Consumer(q);

//         p.start();
//         c.start();

        
//     }
// }

//  class calc extends Thread{
//     public void run(){
        
    
//     for(int i=0;i<2;i++){
//         try{
//             System.out.println("focus");
//             Thread.sleep(2000);
//         }
//         catch(Exception e){
//             System.out.println("i");
//         }

//     }
// }
//  }
// public class thr{
//     public static void main(String[] args) {
//         calc c=new calc();
//         c.start();
//         c.interrupt();
//     }

// }


class a implements Consumer<Integer>{
    public void accept(Integer i){
        System.out.println(i);
    }
}


public class thr{
    public static void main(String[] args) {
        List<Integer> al=Arrays.asList(5,4,3,2,1);
        // java.util.Date as=new java.util.Date();
        // System.out.println(as);
        // long time=as.getTime();
        // java.sql.Date dt=new java.sql.Date(time);
        // System.out.println(dt);
        // LocalDate d=LocalDate.now();
        // System.out.println(d);
        // int day=d.getDayOfMonth();
        // int m=d.getMonthValue();
        // int y=d.getYear();
        // System.out.println(day+"/"+m+"/"+y);
        // LocalTime time=LocalTime.now();
        // System.out.println(time);
        // int hour=time.getHour();
        // int min=time.getMinute();
        // int sec=time.getSecond();
        // int nano=time.getNano();
        // System.out.println(hour+":"+min+":"+sec+":"+nano);

        // Consumer<Integer> cons=new Consumer<Integer>() {
        //     public void accept(Integer i){
        //         System.out.println(i);
        //     }
        // };
        Stream<Integer> s=al.stream();
        Stream<Integer> f=s.filter(n->n%2==0).sorted().map(n->n*2);
        f.forEach(n->System.out.println(n));





    }

}



