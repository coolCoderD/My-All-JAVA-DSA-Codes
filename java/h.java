

import java.util.*;

interface NewRegistration {
    String name();
    int age();
    String emailID();

}

interface PreviousRegistration{
    String nameP();
    int allotedNo();
    
}


class Patient{
    private String name;
    private String  emailId;
    private int age;

    public Patient(String name,String emailID,int age){
        this.name=name;
        this.age=age;
        this.emailId=emailID;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public int getAge() {
        return age;
    }


    public String toString(){
        return name+" "+emailId+" "+age;
    }


}




public class h {
    public static void main(String[] args) {
        Patient p1=new Patient("Aman", "aman@gmail.com", 32);
        Patient p2=new Patient("Sushma", "sushma@gmail.com", 22);
        Patient p3=new Patient("Amit", "amit@gmail.com", 37);
        Map map=new HashMap();
        map.put(1,p1);
        map.put(2,p2);
        map.put(3,p3);
        System.out.println(map);

    }
    
}
int DocNo;
// while(true){
//     System.out.println();
//     System.out.print("Please Press  ");
//     di.Keys(l);
//     System.out.print("  To See The Bio Of Respective Doctor");
//     System.out.println();
//     System.out.println("Press 0 to Quit...................");
//     DocNo=sc.nextInt();
//     if(DocNo==0){
//         break;
//     }
//     else if(di.Checking(DocNo)){
//         System.out.println("Your Appointment Will Be With");
//         System.out.println("***************************************************");
//         System.out.println("Name\t"+"Qualification\t"+"Experience\t");
//         di.ViewDoc(DocNo);
//         System.out.println("****************************************************");
//         System.out.println();
//         System.out.println();
        
//     }
//     else{
//         System.out.println("ERROR!!! ENTER A VALID KEY...");
//     }
// }
System.out.println("********************************************************");
System.out.println();
System.out.print("Finalise Your Choice By Pressing ");
di.Keys(l);
System.out.println();
System.out.println("Press  0 To Leave...................");
DocNo=sc.nextInt();
// if(DocNo==0){
//     System.out.println("Thank You For Your Visit......");
//     System.out.println("You Can Fill Our Feedback Form And Help Us To Improve........");
// }
// else if(di.Checking(DocNo)){
//     System.out.println("Your Appointment Is Final With.......");
//     di.ViewDoc(DocNo);
//     System.out.println("You Have To Pay...."+d.GetDocFee(DocNo));
//     System.out.println("Thank You");
//     System.out.println("You Will Be Directed To Our Payment Gateway...........");
// }
// else{
//     System.out.println("ERROR!!! PLEASE TRY AGAIN");
// }
