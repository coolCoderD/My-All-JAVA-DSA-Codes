import java.time.LocalDate;
import java.time.LocalTime;
enum result{
    pass,fail;
    int m;
    // result(){
    //     System.out.println("constructor");
    // }
    void Setm(int m){
        this.m=m;
    }
    int Getm(){
        return m;
    }
}

public class asg {

    public static void main(String[] args) {
        result r=result.fail;
        System.out.println(r);
        System.out.println(r.ordinal());

        result r1[]=result.values();
        for(result m:r1){
            System.out.println(m.ordinal());
        }

        
    }
}
