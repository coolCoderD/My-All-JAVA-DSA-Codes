import java.io.*;

public class creationoffile {
    public static void main(String[] args) {
        File dir=new  File("PWJAVA");
        File file=new File(dir, "pw.txt");
        // int c=0;
        // String str[]=dir.list();
        // for(String n: str){
        //     System.out.println(n);
        //     c++;
        // }
        // System.out.println(c);


        //Writing
        
        try{
            FileWriter fw=new FileWriter(file,true);
            PrintWriter pw=new PrintWriter(fw);
            //pw.println();
            pw.print("I am name is Diksha ");
            pw.println(78);
            pw.print(true);
            pw.println(true);
            pw.close();

            


        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        


        
    }
}
